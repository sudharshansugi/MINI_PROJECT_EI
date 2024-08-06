// Main.java
// Client code demonstrating the use of the Adapter pattern

public class Main {
    public static void main(String[] args) {
        // Using the adapter for CSV files
        TextFileHandler csvHandler = new FileAdapter("csv");
        csvHandler.openTextFile("data.csv");
        csvHandler.readTextFile("data.csv");
        csvHandler.writeTextFile("data.csv", "CSV content");

        System.out.println();

        // Using the adapter for XML files
        TextFileHandler xmlHandler = new FileAdapter("xml");
        xmlHandler.openTextFile("data.xml");
        xmlHandler.readTextFile("data.xml");
        xmlHandler.writeTextFile("data.xml", "XML content");
    }
}
