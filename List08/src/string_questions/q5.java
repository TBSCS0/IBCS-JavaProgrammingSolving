package string_questions;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        String vowels = "aeiou";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (word.charAt(i) == vowels.charAt(j)){
                    count++;
                }
            }
        }

        if (count == 1) System.out.println("There is " + count + " vowel.");
        else System.out.println("There are " + count + " vowels.");
    }
}
