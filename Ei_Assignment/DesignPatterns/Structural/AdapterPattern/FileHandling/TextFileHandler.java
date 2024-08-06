// TextFileHandler.java
// Interface for handling text files
public interface TextFileHandler {
    void openTextFile(String fileName);
    void readTextFile(String fileName);
    void writeTextFile(String fileName, String content);
}
