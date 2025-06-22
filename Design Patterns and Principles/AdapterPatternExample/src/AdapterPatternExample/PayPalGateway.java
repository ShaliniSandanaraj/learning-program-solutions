package AdapterPatternExample;

public class PayPalGateway {
    public void makePayment(String amount) {
        System.out.println("Paid via PayPal: " + amount);
    }
}