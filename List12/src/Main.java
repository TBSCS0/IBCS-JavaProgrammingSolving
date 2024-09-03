import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,17,7,25,3,100};
        int k = 3;
        System.out.println( q5(arr, k)[0] );
    }

    public static void q1(int[] arr){
        int size = arr.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i]%5==0){
                count++; // count = count + 1
            }
        }
        System.out.println(count);
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

    public static void q7(){
        int[] arr = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        //int[] arrx = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] arrx = new int[arr.length];
        int first = 0;
        int last = arrx.length - 1;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0){ // put even at the beginning
                arrx[first] = arr[i];
                first++;
            }else{
                arrx[last] = arr[i];
                last--;
            }

            for (int j = 0; j < arrx.length; j++) {
                System.out.print(arrx[j] + " ");
            }
            System.out.println();
        }



    }

    public static void q8(){

    }

    public static void q9(){
        int[] arr = {666,9,667,17,5,1,0,55};
        int size = arr.length;

        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-1-i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int aux = arr[j]; // swap
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }
}