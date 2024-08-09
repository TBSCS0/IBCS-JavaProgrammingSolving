package question3;

public class Doctor extends Employee {
    private String speciality;

    public Doctor(String name, String password, String speciality) {
        super(name, password);
        this.speciality = speciality;
    }

    public void changeUsername(String name){
        this.name = name;
        System.out.println("The " + speciality + " " + name + " was changed.");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
