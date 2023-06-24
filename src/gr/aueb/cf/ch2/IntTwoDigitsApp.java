package gr.aueb.cf.ch2;

import java.util.Scanner;

public class IntTwoDigitsApp {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        int num = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sumOfDigits = 0;

        leftDigit = num / 10;
        rightDigit = num % 10;

        System.out.println("Please insert a number with 2 digits");
        num = inputNumber.nextInt();

        
    }
}
