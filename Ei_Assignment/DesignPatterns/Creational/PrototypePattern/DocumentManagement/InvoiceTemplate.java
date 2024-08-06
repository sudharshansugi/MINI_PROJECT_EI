

// InvoiceTemplate.java
public class InvoiceTemplate extends Document {
    public InvoiceTemplate() {
        this.setContent("This is an invoice template.");
    }

    @Override
    public Document clone() {
        InvoiceTemplate clone = new InvoiceTemplate();
        clone.setContent(this.getContent());
        return clone;
    }
}
