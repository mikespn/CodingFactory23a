package gr.aueb.cf.ch2;

public class IntTypesApp {

    public static void main(String[] args) {
        long i = 2;


        System.out.printf("%d", i);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n",
                Integer.TYPE, Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
          System.out.printf("Type: %s, Size: %d bits\n",
                Double.TYPE, Double.BYTES * 8);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n",
                Short.TYPE, Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n",
                Long.TYPE, Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits\n",
                Character.TYPE, Character.BYTES * 8);
    }
}
