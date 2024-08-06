
// Main.java
public class Main {
    public static void main(String[] args) {
        Document report = new ReportTemplate();
        Document invoice = new InvoiceTemplate();
        Document letter = new LetterTemplate();

        Document clonedReport = report.clone();
        Document clonedInvoice = invoice.clone();
        Document clonedLetter = letter.clone();

        System.out.println("Original Report: " + report);
        System.out.println("Cloned Report: " + clonedReport);

        System.out.println("Original Invoice: " + invoice);
        System.out.println("Cloned Invoice: " + clonedInvoice);

        System.out.println("Original Letter: " + letter);
        System.out.println("Cloned Letter: " + clonedLetter);
    }
}
