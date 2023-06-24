package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * demonstrates BigInteger class
 */

public class AddBigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger ("842383452985881");
        BigInteger bigNum2 = new BigInteger("4532523451542");
        BigInteger result = new BigInteger("0");

        result = bigNum.add(bigNum2);

        System.out.printf("%,d", result);
    }
}
