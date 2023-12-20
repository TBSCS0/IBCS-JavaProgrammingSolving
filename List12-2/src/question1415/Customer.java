package question1415;

public class Customer {
    private int id;
    private String name;

    private Exercise[] exercises;


    public Customer(int id, String name, Exercise[] exercises) {
        this.id = id;
        this.name = name;
        this.exercises = exercises;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Exercise[] getExercises() {
        return exercises;
    }

    public void setExercises(Exercise[] exercises) {
        this.exercises = exercises;
    }
}
