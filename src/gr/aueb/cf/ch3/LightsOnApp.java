package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν πρέπει να ανάψουν τα φώτα
 * ενός αυτοκινήτου με βάση τρείς μεταβλητές
 * αν βρέχει και ταυτόχρονα ισχύει ένα από τα παρακάτω:
 * είναι σκοτάδι ή τρέχουμε speed>100
 */
public class LightsOnApp {
// Αρχικοποίηση
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isDark = false;
        boolean isRaining = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;

// Εντολές
        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = in.nextInt();

        isRunning = (speed > 100);
        lightsOn = isRaining && (isRunning || isDark);
        System.out.println("Lights on:" +lightsOn);





    }
}
