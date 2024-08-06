
// LetterTemplate.java
public class LetterTemplate extends Document {
    public LetterTemplate() {
        this.setContent("This is a letter template.");
    }

    @Override
    public Document clone() {
        LetterTemplate clone = new LetterTemplate();
        clone.setContent(this.getContent());
        return clone;
    }
}
