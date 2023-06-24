package gr.aueb.cf.ch5;

public class PowerApp {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int result;

        result = pow(a, b);
        System.out.printf("The power of %d in %d is : %d", a, b, result);
    }

    public static int pow(int a, int b){
        int result =1;
        for (int i =1; i <= b; i++){

            result = result*a;

        }
        return result;
    }
}
