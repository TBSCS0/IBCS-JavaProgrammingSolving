package question4;

public class User {
    String username;
    int age;
    String fr;

    public User() {
    }

    public User(String username, int age, String fr) {
        this.username = username;
        this.age = age;
        this.fr = fr;
    }

    void addFriend(){
        age++;
    }
}
