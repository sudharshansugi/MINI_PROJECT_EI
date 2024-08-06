// PayPalPayment.java
// Concrete strategy for payment using PayPal
public class PayPalPayment implements PaymentStrategy {
    private String emailId;

    public PayPalPayment(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void pay(int amount) {
        // Implement payment logic for PayPal
        System.out.println("Paid " + amount + " using PayPal.");
    }
}


