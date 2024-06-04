package question1;

public class School {
    public static void main(String[] args) {
        Student std1 =  new Student("Yenah", "yenah2020", "123", "yenah@email.com", "Gangnam");
        Student std2 =  new Student("Caio", "caio2020", "123", "caio@email.com", "Porto");
        Student std3 =  new Student("Ed", "ed2020", "123", "eduardo@email.com", "São Paulo");

        System.out.println(std1.getName());
        std3.setName("Eduardo");

        Student std4 = new Student("Nikhil", null, null, null, null);

        System.out.println(std4.getAddress());
    }
}
