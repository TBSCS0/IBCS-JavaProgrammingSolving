package string_questions;

public class q8 {
    public static void main(String[] args) {
        System.out.println( recPal("kayak") );
    }
    public static boolean recPal(String word) {
        if (word.length() == 1) {
            return true;
        } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return recPal(word.substring(1, word.length() - 1));
        }else{
            return false;
        }
    }
}
