package gr.aueb.cf.ch2;
import java.util.Scanner;

/** Μετατρέπει Eu σε Usd
 * Λαμβάνει έναν ακέραιο από τον χρήστη,
 * Συμβολίζει το ποσό σε Euro
 * και το μετατρέπει σε Usd και το εμφανίζει.
 */
public class EuroToUsdConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        System.out.println("Please insert an amount (in Euros)");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("%d Euros = %d USA dollars, %d USA cents", inputEuros, usaDollars, usaCents);
    }
}
