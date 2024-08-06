// ReportTemplate.java
public class ReportTemplate extends Document {
    public ReportTemplate() {
        this.setContent("This is a report template.");
    }

    @Override
    public Document clone() {
        ReportTemplate clone = new ReportTemplate();
        clone.setContent(this.getContent());
        return clone;
    }
}

