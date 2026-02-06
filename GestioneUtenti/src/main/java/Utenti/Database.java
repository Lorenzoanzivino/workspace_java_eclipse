package Utenti;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Database {
    
    private static final String PROPS_FILE = "/db.properties";
    private static final Properties props = new Properties();

    public static Connection getConnection() throws SQLException {
        try {
            // 1. Carichiamo il file di properties
            InputStream in = Database.class.getResourceAsStream(PROPS_FILE);
            if (in == null) {
                throw new RuntimeException("Errore nella lettura delle properties: " + PROPS_FILE);
            }
            props.load(in);
            in.close(); // È importante chiudere lo stream

            // 2. Leggiamo i valori
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String pass = props.getProperty("db.password");

            // 3. Carichiamo la classe del Driver (passaggio standard JDBC scolastico)

            // 4. Restituiamo la connessione
            return DriverManager.getConnection(url, user, pass);

        } catch (IOException e) {
            throw new RuntimeException("Errore I/O lettura properties", e);
        }
    }
}