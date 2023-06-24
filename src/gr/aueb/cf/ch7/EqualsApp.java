package gr.aueb.cf.ch7;

public class EqualsApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("Athens");

        if(s1 == s2 ){
            System.out.println("String s1 and s2 are equal sygkrinei deiktes");
        }
        if(s1.equals(s3)){
            System.out.println("EQUALS");
        }
        if(s1.equalsIgnoreCase(s3)){
            System.out.println("EQUALS IGNORES CASES");
        }
    }
}
