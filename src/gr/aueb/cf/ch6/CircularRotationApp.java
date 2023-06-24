package gr.aueb.cf.ch6;

public class CircularRotationApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        doCircularRightShiftBy(arr, 2);
        for(int item : doCircularRightShiftBy(arr, 52)){
            System.out.print(item + " ");
        }
        
    }

    /**
     * Rotatas the elements of an array by an offset
      * @param arr the given array of integers
     * @param offset the distance to rotate
     * @return the rotated array or null if the given array is null
     */
    public static int[] doCircularRightShiftBy (int[] arr, int offset){
        if(arr  == null) return null;
        int [] rotated = new int[arr.length];

        for(int i = 0; i< arr.length; i++){
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static int[] doCircularLeftShiftBy(int[] arr, int offset){
        if(arr == null) return null;
        int [] rotated = new int[arr.length];

        for(int i = 0; i <= arr.length; i++){
            rotated[(i+ offset) % arr.length] = arr[i];
        }

        return rotated;


    }
}
