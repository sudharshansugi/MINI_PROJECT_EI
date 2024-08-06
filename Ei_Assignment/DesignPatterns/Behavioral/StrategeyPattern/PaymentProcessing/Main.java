// Main.java
// Client class demonstrating the use of Strategy pattern
public class Main {
    public static void main(String[] args) {
        // Create different payment strategies
        PaymentStrategy creditCardPayment = new CreditCardPayment("123456789", "John Doe");
        PaymentStrategy paypalPayment = new PayPalPayment("john@example.com");
        PaymentStrategy cryptoPayment = new CryptoPayment("0x123abc");

        // Using the payment strategies
        creditCardPayment.pay(100);
        paypalPayment.pay(200);
        cryptoPayment.pay(300);
    }
}
