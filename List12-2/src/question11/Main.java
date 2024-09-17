package question11;

public class Main {
    public static void main(String[] args) {
        Subject[] subjects = new Subject[3];
        Subject subject1 = new Subject("Computer Science","Oscar Neiva",7);
        Subject subject2 = new Subject("Physics", "João Lobato", 6);
        Subject subject3 = new Subject("Maths", "John Kings", 4);

        subjects[0] = subject1;
        subjects[1] = subject2;
        subjects[2] = subject3;

        Student student = new Student("Marco Lolito", 12, subjects);
        int sum = student.sumGrades();
    }
}