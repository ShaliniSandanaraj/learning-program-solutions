package StrategyPatternExample;

public class PayPalPayment implements PaymentStrategy {
    public void pay(String amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}