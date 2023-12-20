package question3;

public class Manager extends Employee{
    private String local;

    public Manager(String name, String username, String password, String email, String local) {
        super(name, username, password, email);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
