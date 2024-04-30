package q3;

public class SignIn {
    String password = "mirtilãoDoRogerinh";

    SignIn(){}

    boolean verifyCredentials(String password){
        if (this.password.equals(password)){
            return true;
        }
        return false;
    }
}
