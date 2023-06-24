package gr.aueb.cf.ch5;

/**
 * float double expressions
 */
public class ExpressionApp {
    public static void main(String[] args) {
        double num1 = 12.5;
        double num2 = 2.0;
        double result = 0.0;
        double mod = 0.0;

        result = num1 / num2;
        mod = num1 % num2;

        System.out.printf("%.2f / %.2f = %f\n", num1 , num2, result);
        System.out.printf("%.2f %% %.2f = %.2f", num1, num2, mod);

    }
}
