package gr.aueb.cf.ch8;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class ArithExceptApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1;
        int num2 ;
        int result;

        System.out.println("Please insert a number");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if(num2 == 0){
            System.out.println("Please");
            System.exit(1);
        }


    }
}
