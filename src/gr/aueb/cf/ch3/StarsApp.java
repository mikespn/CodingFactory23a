package gr.aueb.cf.ch3;

import java.util.Scanner;

public class StarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberofstars = 0;
        int i = 0;

        System.out.println("Please insert number of stars");
        numberofstars = in.nextInt();
        while(i < numberofstars){
            System.out.print("*");
            i++;
            if (i % 50 == 0){
                System.out.println();
            }
        }
    }
}
