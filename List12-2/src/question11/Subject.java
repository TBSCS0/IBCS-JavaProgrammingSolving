package question11;

public class Subject {
    private String name;
    private String teacher;
    private int grade;

    public Subject(String name, String teacher, int grade) {
        this.name = name;
        this.teacher = teacher;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
