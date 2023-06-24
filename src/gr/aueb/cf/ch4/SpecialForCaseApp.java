package gr.aueb.cf.ch4;

/**
 * Aenao for loop
 */
public class SpecialForCaseApp {
    public static void main(String[] args) {
        int counter = 0;

        for(;;){
            System.out.println("forever ");
            counter++;
            if(counter% 20 == 0){
                System.out.print(" ");
            }
            if(counter == 100) break;
        }
    }
}
