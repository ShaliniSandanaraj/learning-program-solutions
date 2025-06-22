package StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy {
    public void pay(String amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}