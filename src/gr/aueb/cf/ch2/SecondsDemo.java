package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει δευτερόλεπτα σε Days,
 * hours, Minutes, Secs.
 */
public class SecondsDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int DAY_SECS = 24 * 36000;
        final int HOURS_SECS = 3600;
        final int MINUTES_SECS = 60;
        int inputSeconds = 0;
        int remainingSeconds;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Please insert the total amount of seconds");
        inputSeconds = in.nextInt();

        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY_SECS;
        remainingSeconds = remainingSeconds % DAY_SECS;

        hours = remainingSeconds / HOURS_SECS;
        remainingSeconds = remainingSeconds % HOURS_SECS;

        minutes = remainingSeconds / MINUTES_SECS;
        remainingSeconds = remainingSeconds % MINUTES_SECS;

        seconds = remainingSeconds;

        System.out.printf("%,d input seconds = %d days, %d hours, %d minutes,  %d seconds",
                inputSeconds, days, hours, minutes, seconds);
    }
}
