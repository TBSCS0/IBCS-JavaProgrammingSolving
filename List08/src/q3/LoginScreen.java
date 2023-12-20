package q3;

public class LoginScreen {
    public static void main(String[] args) {
        SignIn signIn = new SignIn();
        System.out.println(signIn.verifyCredential("123aaa"));
    }
}
