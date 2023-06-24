package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Adds and Multies n numbers . N is given by the user
 */
public class AddMullApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int result = 1;

        System.out.println("Please insert a number");
        n = in.nextInt();

        for(int i = 1; i<=n; i++){
            sum += i;
            result = result * i;
        }

        System.out.println("Sum = " + sum);
        System.out.printf("Mul:%,d", result);
    }
}
