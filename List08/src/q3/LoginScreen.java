package q3;

import java.util.Scanner;

public class LoginScreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();

        SignIn signIn = new SignIn();
        System.out.println(signIn.verifyCredentials(password));
    }
}
