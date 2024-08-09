package demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int[] numbers = {78, 420, 12, 314, 5};
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
