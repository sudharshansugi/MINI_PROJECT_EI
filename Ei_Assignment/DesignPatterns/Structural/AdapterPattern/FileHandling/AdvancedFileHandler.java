// AdvancedFileHandler.java
// Class for handling advanced file formats like CSV and XML

public class AdvancedFileHandler {
    public void openCSV(String fileName) {
        System.out.println("Opening CSV file: " + fileName);
    }

    public void readCSV(String fileName) {
        System.out.println("Reading CSV file: " + fileName);
    }

    public void writeCSV(String fileName, String content) {
        System.out.println("Writing to CSV file: " + fileName);
        System.out.println("Content: " + content);
    }

    public void openXML(String fileName) {
        System.out.println("Opening XML file: " + fileName);
    }

    public void readXML(String fileName) {
        System.out.println("Reading XML file: " + fileName);
    }

    public void writeXML(String fileName, String content) {
        System.out.println("Writing to XML file: " + fileName);
        System.out.println("Content: " + content);
    }
}
