package question4;

public class Facebook {
    public static void main(String[] args) {
        User user = new User("Diego", 16, "unreal");
        user.addFriend();
        System.out.println("User: " + user.username + "; N° Friends: " + user.age);
    }
}
