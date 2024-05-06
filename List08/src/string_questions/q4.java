package string_questions;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        int index = word.length()/2;

        if (word.length()%2 == 0){
            System.out.println(word.charAt(index-1) + "" + word.charAt(index));
        }else{
            System.out.println(word.charAt(index));
        }
    }
}
