package Utenti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utenti.exceptions.CredenzialiErrateException;
import Utenti.exceptions.UsernameErratoException;
import Utenti.exceptions.UsernameInUsoException;

public class DAOUtenti {

    // 1. REGISTRAZIONE UTENTE
    public void registra(Utente u) throws UsernameInUsoException, SQLException {
        // Prima controlliamo se esiste già
        if (esisteUsername(u.getUsername())) {
            throw new UsernameInUsoException(u.getUsername());
        }

        String query = "INSERT INTO utente (username, password, nome, cognome, anno_nascita) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            ps.setString(3, u.getNome());
            ps.setString(4, u.getCognome());
            ps.setInt(5, u.getAnnoNascita());

            ps.executeUpdate();
        }
    }

    // 2. LOGIN
    public Utente login(String username, String password) throws CredenzialiErrateException, SQLException {
        String query = "SELECT * FROM utente WHERE username = ? AND password = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Login corretto, restituisco l'oggetto Utente riempito
                    return new Utente(
                        rs.getString("nome"),
                        rs.getString("cognome"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("anno_nascita")
                    );
                } else {
                    // Nessun risultato trovato
                    throw new CredenzialiErrateException("ERRORE");
                }
            }
        }
    }

    // 3. MODIFICA PASSWORD
    public void modificaPassword(String username, String nuovaPassword) throws UsernameErratoException, SQLException {
        String query = "UPDATE utente SET password = ? WHERE username = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, nuovaPassword);
            ps.setString(2, username);

            int righeModificate = ps.executeUpdate();
            if (righeModificate == 0) {
                throw new UsernameErratoException(username);
            }
        }
    }

    // 4. CANCELLA UTENTE
    public void cancella(String username) throws UsernameErratoException, SQLException {
        String query = "DELETE FROM utente WHERE username = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, username);

            int righeCancellate = ps.executeUpdate();
            if (righeCancellate == 0) {
                throw new UsernameErratoException(username);
            }
        }
    }

    // 5. VISUALIZZA TUTTI (Funzione Admin)
    public List<Utente> visualizzaTutti() throws SQLException {
        List<Utente> listaUtenti = new ArrayList<>();
        String query = "SELECT * FROM utente";

        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Utente u = new Utente(
                    rs.getString("nome"),
                    rs.getString("cognome"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getInt("anno_nascita")
                );
                listaUtenti.add(u);
            }
        }
        return listaUtenti;
    }

    // Metodo di supporto privato per verificare esistenza username
    private boolean esisteUsername(String username) throws SQLException {
        String query = "SELECT count(*) FROM utente WHERE username = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            
            ps.setString(1, username);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }
}