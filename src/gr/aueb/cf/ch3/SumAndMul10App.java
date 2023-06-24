package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumAndMul10App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int mul = 1;
        int i = 1;
        int num =0;
        while (i<= 10){
            sum += i;
            mul *= i;
            i++;

        }
        System.out.printf("Sum: %d and Mul: %d", sum, mul);
    }
}
