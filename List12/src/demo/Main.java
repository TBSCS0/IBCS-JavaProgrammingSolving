package demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
