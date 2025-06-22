package StrategyPatternExample;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(String amount) {
        strategy.pay(amount);
    }
}