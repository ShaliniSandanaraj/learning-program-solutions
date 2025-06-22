// Save this file as ForecastTool.java
public class ForeCastTool {

    // Recursive method to calculate future value
    static double predictRecursive(double currentValue, double rate, int years) {
        if (years == 0) return currentValue;
        return predictRecursive(currentValue * (1 + rate), rate, years - 1);
    }

    // Optimized iterative method
    static double predictIterative(double currentValue, double rate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + rate);
        }
        return currentValue;
    }

    public static void main(String[] args) {
        double baseAmount = 10000; // initial value
        double growthRate = 0.1;   // 10% annual growth
        int numYears = 5;

        double recursiveResult = predictRecursive(baseAmount, growthRate, numYears);
        double iterativeResult = predictIterative(baseAmount, growthRate, numYears);

        System.out.println("Predicted (Recursive): ₹" + recursiveResult);
        System.out.println("Predicted (Iterative): ₹" + iterativeResult);
    }
}
