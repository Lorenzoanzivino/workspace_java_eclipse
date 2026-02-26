package FactorySingleton;

public class FactoryDataExport {

    public static DataExport getExporter(String className) {
        try {
            return (DataExport) Class.forName("FactorySingleton." + className).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}