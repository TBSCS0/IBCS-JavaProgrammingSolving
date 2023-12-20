package question1;

public class Student extends User{
    private String email;
    private String address;


    public Student(String name, String username, String password) {
        super(name, username, password);
    }

    public Student(String name, String username, String password, String email, String address) {
        super(name, username, password);
        this.email = email;
        this.address = address;
    }
}
