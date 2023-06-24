package gr.aueb.cf.ch10;

/**
 * Finds the position in an array of the max element
 * of the array
 */
public class Project6 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 6, 8, 12, 2};
        int maxPos;

        maxPos = getMaxPosition(arr, 0, arr.length-1);
        if(maxPos == -1){
            System.out.println("Error");
            System.exit(-1);
        }
    }

    public static int getMaxPosition(int[] arr, int low, int high){
        int maxPosition = 0;
        int maxValue = 0;

        if(arr == null || arr.length == 0) return -1;
        if(low < 0 || high > arr.length || low > high) return -1;

        maxValue = arr[low];
        for(int i = low + 1; i <= high; i++){
            if(arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
