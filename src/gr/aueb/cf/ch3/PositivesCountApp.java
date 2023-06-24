package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int i = 0;

        System.out.printf("Please insert a number:");
        n = in.nextInt();

        while (n >= 0){
            i++;
            System.out.printf("Please insert a number:");
            n = in.nextInt();
        }
        System.out.printf("Positive-count:%d", i);
    }
}
