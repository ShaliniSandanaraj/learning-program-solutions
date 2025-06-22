package AdapterPatternExample;

public class StripeAdapter implements PaymentProcessor {
    private StripeGateway gateway = new StripeGateway();

    public void processPayment(String amount) {
        gateway.stripePay(amount);
    }
}