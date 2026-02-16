package Utenti;

public class Utente {
    // Rimossa la variabile statica inutile
    
    private String nome;
    private String cognome;
    private String username;
    private String password;
    private int annoNascita; // Corretto da String a int per matchare il DB

    public Utente(String nome, String cognome, String username, String password, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password = password;
        this.annoNascita = annoNascita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAnnoNascita() { // Corretto ritorno int
        return annoNascita;
    }
}