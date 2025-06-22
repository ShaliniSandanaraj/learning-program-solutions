package StrategyPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment("250");

        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment("400");
    }
}