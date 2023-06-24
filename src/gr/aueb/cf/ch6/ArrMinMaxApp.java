package gr.aueb.cf.ch6;

public class ArrMinMaxApp {
    public static void main(String[] args) {

        int arr[] = {30, 12, 7, 15};

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++){
            if(arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        System.out.printf("Min value: %d and Min Position: %d", minValue, minPosition);
    }


}
