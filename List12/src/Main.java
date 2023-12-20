import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 5, 8, 3, 6, 10};
        //q5();
        q7();
        //q9();
        //System.out.println(q0(arr));
    }

    public static int q0(int[] arr){
        int size = arr.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i]%5==0){
                count++; // count = count + 1
            }
        }
        return count;
    }

    public static void q5(){
        int[] arr = {1, 4, 17, 7, 25, 3, 100};

        int k = 3;
        int[] max = new int[k];
        int maxIndex = 0;

        int[] min = new int[k];
        int minIndex = 0;

        // Find k max elements
        for (int i = 0; i < max.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max[i]){
                    max[i] = arr[j];
                    maxIndex = j;
                }
            }
            arr[maxIndex] = 0;
        }
        for (int i = 0; i < max.length; i++) {
            System.out.println(max[i]);
        }

        // Find k smallests elements
        for (int i = 0; i < min.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > min[i]){
                    min[i] = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = 0;
        }
        for (int i = 0; i < min.length; i++) {
            System.out.println(min[i]);
        }
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