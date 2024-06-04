package question1;

public class Student extends User{
    private String email;
    private String address;

    public Student(String name, String username, String password, String email, String address) {
        super(name, username, password);
        this.email = email;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
