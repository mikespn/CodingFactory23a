package gr.aueb.cf.ch4;

import java.util.Scanner;

public class FrogAppFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int jumpDistance = 0;
        int jumps = 0;

        System.out.println("Please insert the position of the frog, the final position, and jump distance. ");
        x = in.nextInt();
        y = in.nextInt();
        jumpDistance = in.nextInt();

        for(int i= x; i < y; i += jumpDistance){
            jumps++;
        }
        System.out.println("he neeed " + jumps +"jumps");

    }
}
