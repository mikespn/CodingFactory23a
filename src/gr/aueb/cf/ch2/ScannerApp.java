package gr.aueb.cf.ch2;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Please insert 2 ints");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;
        System.out.printf("Your ints are: %d %d.%nTheir sum is %d", num1, num2, sum);
    }
}
