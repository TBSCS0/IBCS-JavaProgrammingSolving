package question3;

public class Task {
    private String local;
    private String description;

    public Task(String local, String description) {
        this.local = local;
        this.description = description;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
