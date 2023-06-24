package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * vriskei to min h kai to max 2 arithmwn poy parexei o xrhsths
 *
 */
public class MinMaxApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int max = 0;
        int min = 0;

        System.out.println("Please enter 2 numbers (int)");
        num1 = in.nextInt();
        num2 = in.nextInt();


        if (num1 == num2 ) {
            System.out.println("Your numbers are the same");
        }
            else if (num2 > num1) {
                max = num2;
                min = num1;
                System.out.printf("The max is %d and the min is %d", max, min);
            }
            else{
                max = num1;
                min = num2;
                System.out.printf("The max is %d and the min is %d", max, min);
            }

    }
}
