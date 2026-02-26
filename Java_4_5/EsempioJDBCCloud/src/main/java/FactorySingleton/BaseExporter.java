package FactorySingleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class BaseExporter implements DataExport {

    protected void scriviSuFile(String testo, String fileName) {
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(fileName, true));
            bf.write(testo);
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}