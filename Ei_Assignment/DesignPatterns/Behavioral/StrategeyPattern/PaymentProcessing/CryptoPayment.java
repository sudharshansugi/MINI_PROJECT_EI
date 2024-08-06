// CryptoPayment.java
// Concrete strategy for payment using Cryptocurrency
public class CryptoPayment implements PaymentStrategy {
    private String cryptoWalletAddress;

    public CryptoPayment(String cryptoWalletAddress) {
        this.cryptoWalletAddress = cryptoWalletAddress;
    }

    @Override
    public void pay(int amount) {
        // Implement payment logic for cryptocurrency
        System.out.println("Paid " + amount + " using Cryptocurrency.");
    }
}

