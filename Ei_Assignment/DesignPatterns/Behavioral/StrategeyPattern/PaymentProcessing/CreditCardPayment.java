// CreditCardPayment.java
// Concrete strategy for payment using Credit Card
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(int amount) {
        // Implement payment logic for credit card
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
