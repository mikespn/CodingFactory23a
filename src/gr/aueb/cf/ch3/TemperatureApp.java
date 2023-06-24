package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει με βάση την θερμοκρασία. Αν η θερμοκρασία
 * <0 τότε χιονίζει αλλιώς δεν χιονίζει. O χρήστης δίνει την θερμοκρασία.
 */
public class TemperatureApp {
    //Αρχικοποίηση
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;
// Εντολές
        System.out.println("Please insert current Temperature");
        temp = in.nextInt();

        isSnowing = (temp <0);

        System.out.println("Is snowing: " + isSnowing);


    }

}
