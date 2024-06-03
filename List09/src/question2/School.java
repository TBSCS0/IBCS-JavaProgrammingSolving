package question2;

public class School {
    public static void main(String[] args) {
        Student std1 =  new Student("Milo", 12, 5);
        Student std2 =  new Student("Gabi", 17, 11);
        Student std3 =  new Student("Ben", 15, 8);
        Student std4 =  new Student("Luca", 13, 6);

        System.out.println(std3.getAge());
        std2.setYearGroup(10);
        std1.setName("Emile");
        System.out.println(std1.getName());
    }
}
