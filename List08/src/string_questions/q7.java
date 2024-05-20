package string_questions;

public class q7 {
    public static void main(String[] args) {
        String word = "olitrimmirtiloroge";
        int count = 0;
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) == word.charAt( word.length()-1-i )){
                count++; // count += 1; count = count + 1
            }
        }
        if (count == word.length()/2){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
