package question3;

public class Nurse extends Employee {
    private String occupation;

    public Nurse(String name, String password, String occupation) {
        super(name, password);
        this.occupation = occupation;
    }

    public void changeUsername(String name){
        this.name = name;
        System.out.println(name + " from " + occupation + " was changed.");
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
