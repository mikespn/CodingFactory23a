package gr.aueb.cf.ch6;

public class ReplaceApp {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 9, 15};
        replace(arr, 6, 56);
        for(int item : arr){
            System.out.println(item + " ");
        }

    }

    public static void replace(int[] arr, int oldVal, int newVal){
        int positionToUpdate = -1;

        if(arr == null)return;
        positionToUpdate = getIndex(arr, oldVal);
        if(positionToUpdate == -1)return;
        arr[positionToUpdate] = newVal;

    }

    public static int getIndex(int arr[], int value){
            if (arr == null) return -1;

            int position = -1;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == value){
                    position = i;
                    break;
                }
            }
            return position;
    }
}
