package gr.aueb.cf.ch6;

public class Missing2 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4, 7 ,8};
        getMissing(arr);
        System.out.println("The number missing is: " + getMissing(arr));

    }

    public static int getMissing(int[] arr){
        int[] secondaryArr = new int[arr.length+2];

        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j <= arr.length; j++){
                if(arr[i] == j) {
                    secondaryArr[j] = 1;
                }
            }
        }

        for(int i = 1; i < secondaryArr.length-1; i++){
            if(secondaryArr[i] == 0){
                secondaryArr[secondaryArr.length-1] = i;
            }
        }
        return secondaryArr[secondaryArr.length-1];
    }
}
