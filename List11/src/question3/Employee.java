package question3;

public class Employee {
    protected String name;
    protected String password;

    public Employee(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void changeUsername(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
