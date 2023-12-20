package question1;

public class School {
    public static void main(String[] args) {
        Student std1 =  new Student("Yenah", "yenah2020", "123", "yenah@email.com", "Gangnam");
        Student std2 =  new Student("Yenah", "yenah2020", "123", "yenah@email.com", "Gangnam");
        Student std3 =  new Student("Ed", "ed2020", "123", "eduardo@email.com", "São Paulo");

        std1.setName("caio");
        System.out.println(std2.getName());
    }
}
