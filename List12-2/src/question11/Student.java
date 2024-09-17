package question11;

public class Student {
    private String name;
    private int classis;
    private Subject[] subjects;

    public Student(String name, int classis, Subject[] subjects) {
        this.name = name;
        this.classis = classis;
        this.subjects = subjects;
    }

    public int sumGrades(){
        int sum = 0;
        for (int i = 0; i < subjects.length; i++) {
            sum = sum + subjects[i].getGrade();
        }
        return sum;
    }
}
