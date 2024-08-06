// Document.java
public abstract class Document implements Cloneable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public abstract Document clone();

    @Override
    public String toString() {
        return "Document [content=" + content + "]";
    }
}

