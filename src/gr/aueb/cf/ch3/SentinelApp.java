package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Keeps readign till sentinel value is provided
 */
public class SentinelApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please provide a num");
        num = in.nextInt();

        while (num !=0){
            iterations++;
//            System.out.println(num);
            System.out.println("Please provide a num");
            num = in.nextInt();
        }
        System.out.printf("%d iterations", iterations );
    }
}
