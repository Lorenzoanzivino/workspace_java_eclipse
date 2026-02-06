package Utenti;

import java.sql.SQLException;
import java.util.List;

import Utenti.exceptions.CredenzialiErrateException;
import Utenti.exceptions.UsernameErratoException;
import Utenti.exceptions.UsernameInUsoException;

public class App {

    public static void main(String[] args) {
        
        // --- CONFIGURAZIONE TEST ---
        // Definisco qui i dati così li uso uguali dappertutto!
        String TEST_USER = "Reptile"; 
        String TEST_PASS = "passwordSegreta";
        String TEST_NOME = "Stefano";
        String TEST_COGNOME = "Reali";
        int TEST_ANNO = 1990;

        DAOUtenti dao = new DAOUtenti();
        Utente nuovoUtente = new Utente(TEST_NOME, TEST_COGNOME, TEST_USER, TEST_PASS, TEST_ANNO);

        System.out.println("------------------------------------------------");
        System.out.println("   AVVIO APPLICAZIONE GESTIONE UTENTI (TEST)    ");
        System.out.println("------------------------------------------------");

        // --- 1. TEST REGISTRAZIONE ---
        System.out.println("\n[1] TENTATIVO DI REGISTRAZIONE...");
        try {
            // Pulizia preventiva: se esiste già lo cancello per rifare il test pulito
            try { dao.cancella(TEST_USER); } catch (Exception e) {}

            dao.registra(nuovoUtente);
            System.out.println(">>> SUCCESSO: Utente " + TEST_USER + " registrato correttamente.");
        } catch (UsernameInUsoException e) {
            System.out.println(">>> ERRORE: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println(">>> ERRORE DATABASE: " + e.getMessage());
        }

        // --- 2. TEST LOGIN (Caso Errato) ---
        System.out.println("\n[2] TEST LOGIN (Password Sbagliata)...");
        try {
            dao.login(TEST_USER, "passwordSbagliata123");
        } catch (CredenzialiErrateException e) {
            System.out.println(">>> OK: Il sistema ha bloccato l'accesso come previsto.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // --- 3. TEST LOGIN (Caso Corretto) ---
        System.out.println("\n[3] TEST LOGIN (Corretto)...");
        try {
            Utente loggato = dao.login(TEST_USER, TEST_PASS);
            System.out.println(">>> BENVENUTO: " + loggato.getNome() + " " + loggato.getCognome());
        } catch (Exception e) {
            System.out.println(">>> ERRORE INATTESO: " + e.getMessage());
        }

        // --- 4. TEST MODIFICA PASSWORD ---
        System.out.println("\n[4] CAMBIO PASSWORD...");
        try {
            String nuovaPass = "nuovaPass1234";
            dao.modificaPassword(TEST_USER, nuovaPass);
            System.out.println(">>> PASSWORD AGGIORNATA CON SUCCESSO.");
            
            // Verifichiamo se funziona la nuova password
            dao.login(TEST_USER, nuovaPass);
            System.out.println(">>> VERIFICA LOGIN CON NUOVA PASSWORD: OK.");
            
        } catch (UsernameErratoException e) {
            System.out.println(">>> ERRORE LOGICO: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(">>> ERRORE GENERICO: " + e.getMessage());
        }

        // --- 5. TEST VISUALIZZA TUTTI (ADMIN) ---
        System.out.println("\n[5] LISTA UTENTI NEL DB...");
        try {
            List<Utente> elenco = dao.visualizzaTutti();
            for (Utente u : elenco) {
                System.out.println(" - " + u.getUsername() + " (" + u.getNome() + " " + u.getCognome() + ")");
            }
        } catch (SQLException e) {
            System.out.println(">>> ERRORE LETTURA LISTA: " + e.getMessage());
        }

        // --- 6. TEST CANCELLAZIONE ---
        System.out.println("\n[6] CANCELLAZIONE UTENTE...");
        try {
            dao.cancella(TEST_USER);
            System.out.println(">>> UTENTE " + TEST_USER + " CANCELLATO.");
            
        } catch (UsernameErratoException e) {
            System.out.println(">>> ERRORE LOGICO: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println(">>> ERRORE DATABASE: " + e.getMessage());
        }
        
        System.out.println("\n------------------------------------------------");
        System.out.println("              FINE TEST                         ");
        System.out.println("------------------------------------------------");
    }
}