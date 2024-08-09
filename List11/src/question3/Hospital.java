package question3;

public class Hospital {
    public static void main(String[] args) {
        Nurse nurse = new Nurse("Leo", "123", "emergency");
        Doctor doctor = new Doctor("Pedro", "123", "infectologist");
        nurse.changeUsername("Leonardo Furtado");
        doctor.changeUsername("Pedro Picciani");
    }
}
