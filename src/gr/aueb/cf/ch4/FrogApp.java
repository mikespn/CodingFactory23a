package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Enas mikros batraxos thelei na perasei ena potami
 * o frog brisketai sthn thesh x kai thelei na ftasei sthn
 * thesh y h se thesh megalyterh apo thn y. o frog jump D
 * poios einai o elaxistona arithmos jumps poy o frog
 * prepei na kanei gia na ftasei sto telos.
 *
 */
public class FrogApp {
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

        while(x<y){
            x = x+ jumpDistance;
            jumps ++;

        }
        System.out.println("he neeed " + jumps +"jumps");




    }
}
