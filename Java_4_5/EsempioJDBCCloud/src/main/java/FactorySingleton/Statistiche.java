package FactorySingleton;

import java.util.List;

public class Statistiche {

    private DataExport exporter;

    public Statistiche(DataExport exporter) {
        this.exporter = exporter;
    }

    public void esportaCategory(List<String> data) {
        exporter.export(data, "category_export.txt");
        System.out.println("MIME type: " + exporter.getMime());
    }

    public void esportaCity(List<String> data) {
        exporter.export(data, "city_export.txt");
        System.out.println("MIME type: " + exporter.getMime());
    }
}