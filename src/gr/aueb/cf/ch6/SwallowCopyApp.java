package gr.aueb.cf.ch6;

public class SwallowCopyApp {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[arr1.length];

     // Swallow Copy
     //  arr2 = arr1;

     //   arr2[0] = 222;

        for(int item : arr1){
            System.out.println(item + " ");
        }

        // Deep Copy
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
    }
}
