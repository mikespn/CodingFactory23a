package gr.aueb.cf.ch2;

public class AddApp {
    public static void main(String[] args) {
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;
        int num3 = 0;
        int i = num2*num2*num2*num2*num2*num2*num2*num2*num2*num2;

        num3 = (int) Math.pow(num3, 10);
        //Εντολές
        result = num1 + num2;

        System.out.println("Sum: " +result);
        System.out.println(i);
    }
}
