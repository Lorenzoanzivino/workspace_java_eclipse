package FactorySingleton;

import java.util.List;

public class JsonExporter extends BaseExporter {

    public JsonExporter() {}

    @Override
    public void export(List<String> data, String fileName) {
        String testo = "{\n";
        for (String s : data) {
            testo += "\"" + s.replace(":", "\":\"") + "\"\n";
        }
        testo += "}\n";

        scriviSuFile(testo, fileName);
    }

    @Override
    public String getMime() {
        return "application/json";
    }
}