package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ypologizei to a^n anadromika
 */
public class PowerRecursiveApp {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      float a;
      float b;

      a = in.nextFloat();
      b = in.nextFloat();
      System.out.println(power(a,b));
    }

    /**
     * recursive a^n
     * @param a the base.
     * @param b the power.
     * @return the power of base number
     */
    public static float power (float a, float b){
        if( b == 0){
            return 1;

        } else if(b < 0){
            return 1/a*power(a, b+1 );

        }else {
            return a*power(a,b-1);
         }

    }
}
