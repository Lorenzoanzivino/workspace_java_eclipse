package FactorySingleton;

import java.util.Arrays;
import java.util.List;

public class Settings {

    public static void main(String[] args) {

        List<String> exportTypes = Arrays.asList("CsvExporter", "JsonExporter");

        for (String type : exportTypes) {
            DataExport exporter = FactoryDataExport.getExporter(type);
            Statistiche stat = new Statistiche(exporter);

            List<String> data = Arrays.asList("ID:101", "Prodotto:Caffè", "Prezzo:5.50");

            stat.esportaCategory(data);
            stat.esportaCity(data);
        }
    }
}