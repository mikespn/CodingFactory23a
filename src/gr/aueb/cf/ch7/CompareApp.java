package gr.aueb.cf.ch7;

/**
 * Comapres 2 strings
 */
public class CompareApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";

        if(s1.compareTo(s2) < 0){
            System.out.println("s1 less than s2");
        } else if(s1.compareTo(s2) > 0){
            System.out.println("s1 greater than s2");
        }else{
            System.out.println("s1 is equal with s2");
        }
    }
}
