package string_questions;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') count++;
        }
        System.out.println(count);

        /* Extra: solving the question in 1 line
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(sentence.split(" ").length);
        */
    }
}
