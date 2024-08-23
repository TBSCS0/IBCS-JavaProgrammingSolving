package demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        selectionSort();
    }

    public static void selectionSort(){
        int[] arr = {1618, 1, 3, 2, 314, 32, 42, 757};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            int aux = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = aux;
        }
    }

    public static void bubbleSort(){
        int[] arr = {1618, 1, 3, 2, 314, 32, 42, 757};
        boolean swapped;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
