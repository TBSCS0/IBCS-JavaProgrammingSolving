package question3;

public class Staff extends Employee{
    private String specialty;
    private Task task;

    public Staff(String name, String username, String password, String email, String specialty, Task task) {
        super(name, username, password, email);
        this.specialty = specialty;
        this.task = task;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
