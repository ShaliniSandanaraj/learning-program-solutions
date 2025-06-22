package AdapterPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PayPalAdapter();
        processor.processPayment("100");

        processor = new StripeAdapter();
        processor.processPayment("200");
    }
}