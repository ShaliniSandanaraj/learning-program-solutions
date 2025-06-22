package AdapterPatternExample;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway gateway = new PayPalGateway();

    public void processPayment(String amount) {
        gateway.makePayment(amount);
    }
}