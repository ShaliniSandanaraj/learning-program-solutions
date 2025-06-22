package AdapterPatternExample;

public class StripeGateway {
    public void stripePay(String amount) {
        System.out.println("Paid via Stripe: " + amount);
    }
}