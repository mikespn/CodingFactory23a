package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει ή όχι, με βάση όχι μόνο την θερμοκρασία
 * αλλά και το αν βρέχει. Αν βρέχεικαι η θερμοκρασία είναι <0 τότε χιονίζει
 * αλλιώς όχι
 */
public class SnowingApp {
//Αρχικοποίηση
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaing = false;
        int temp = 0;

//Εντολές
        System.out.println("Please inser if it is raining (true/false)");
        isRaing =in.nextBoolean();

        System.out.println("Please insert the temperature (int)");
        temp = in.nextInt();

//Αποτελέσματα
        isSnowing = isRaing && (temp<0);

        System.out.println("Is snowing: " + isSnowing);

    }
}
