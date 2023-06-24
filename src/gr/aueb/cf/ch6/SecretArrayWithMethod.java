package gr.aueb.cf.ch6;

public class SecretArrayWithMethod {
    public static void main(String[] args) {
        int value = 6;
        int[] arr = {1, 2, 3, 4, 5, 6};
        int position = 0;
        position = getElementPosition(arr, value);
        System.out.println(position);
    }

    public static int getElementPosition(int[] arr, int value){
        if(arr == null){return -1;}

        int iterations = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                iterations = i;
                break;
            }
        }
        return iterations;
    }
}
