// FileAdapter.java
// Adapter class that adapts AdvancedFileHandler to TextFileHandler
public class FileAdapter implements TextFileHandler {
    private AdvancedFileHandler advancedFileHandler;
    private String fileType;

    public FileAdapter(String fileType) {
        this.fileType = fileType;
        advancedFileHandler = new AdvancedFileHandler();
    }

    @Override
    public void openTextFile(String fileName) {
        if (fileType.equalsIgnoreCase("csv")) {
            advancedFileHandler.openCSV(fileName);
        } else if (fileType.equalsIgnoreCase("xml")) {
            advancedFileHandler.openXML(fileName);
        }
    }

    @Override
    public void readTextFile(String fileName) {
        if (fileType.equalsIgnoreCase("csv")) {
            advancedFileHandler.readCSV(fileName);
        } else if (fileType.equalsIgnoreCase("xml")) {
            advancedFileHandler.readXML(fileName);
        }
    }

    @Override
    public void writeTextFile(String fileName, String content) {
        if (fileType.equalsIgnoreCase("csv")) {
            advancedFileHandler.writeCSV(fileName, content);
        } else if (fileType.equalsIgnoreCase("xml")) {
            advancedFileHandler.writeXML(fileName, content);
        }
    }
}
