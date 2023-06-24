package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * lambanei 3 times apo ton xrhsth: a b c opou a einai h upotinousa
 * elegxei an to trigwno einai orthogwnio dhladh
 * a^2 = b^2 + c^2
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please insert the long side of the tringle (a) as well as the other 2 (b) and (c)");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if ((Math.pow(a, 2) - (Math.pow(b, 2) + Math.pow(c, 2))) <= EPSILON ){
            isRight = true;

        }
        System.out.println("is the triangle right: "+ isRight);
    }
}
