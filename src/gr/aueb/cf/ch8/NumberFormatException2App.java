package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatException2App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (true) {
            System.out.println("Please insert an int");

            if (in.hasNextInt()) {
                inputNum = in.nextInt();
            } else {
                in.nextLine();
                System.out.println("Error.Please insert a valid int");
                continue;
            }
            if (inputNum == MAGIC_NUM) {
                System.out.println("Great");
                break;
            }
        }
    }
}

