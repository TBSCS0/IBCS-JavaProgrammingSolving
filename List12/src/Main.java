import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,17,7,25,3,100};
        int k = 2;
        q7(arr,k);
    }

    public static int[] q5(int[] arr, int k){
        int[] maxArr = new int[k];
        int maxIndex = 0;

        for (int i = 0; i < maxArr.length; i++) {
            int max = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > max){
                    max = arr[j];
                    maxIndex = j;
                }
            }

            maxArr[i] = arr[maxIndex];
            arr[maxIndex] = 0;
        }
        return maxArr;
    }

    public static void q7(int[] arr, int k){


        int[] maxArr = new int[k];
        int[] minArr = new int[k];
        int size = arr.length;

        for (int i = 0; i < k; i++) {
            int maxIndex = 0, minIndex = 0;
            for (int j = i+1; j < arr.length- i; j++) {
                if (arr[maxIndex] > arr[j]) {
                    maxIndex = j;
                }
                if (arr[minIndex] < arr[j]) {
                    minIndex = j;
                }
            }
            maxArr[i] = arr[maxIndex];
            minArr[i] = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = minArr[i];
            arr[size - i -1] = maxArr[i];
            arr[maxIndex] = minArr[size - i -1];
        }

    }
}