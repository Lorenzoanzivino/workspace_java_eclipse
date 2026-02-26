package FactorySingleton;

import java.util.List;

public class CsvExporter extends BaseExporter {

    public CsvExporter() {}

    @Override
    public void export(List<String> data, String fileName) {
        String testo = String.join(",", data) + "\n";
        scriviSuFile(testo, fileName);
    }

    @Override
    public String getMime() {
        return "text/csv";
    }
}