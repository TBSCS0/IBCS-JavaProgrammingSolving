package constructor;

public class DriverClass {
    public static void main(String[] args) {
        // Without constructor
        Duck duck1 = new Duck();
        duck1.name = "Rogerinh";
        duck1.age = 12;
        duck1.hasQuack = true;

        Duck duck2 = new Duck();
        duck2.name = "Rosa Tangerina";
        duck2.age = 15;
        duck2.hasQuack = false;

        // With constructor
        Duck duck11 = new Duck("Rogerinh", 12, true);
        Duck duck22 = new Duck("Rosa Tangerina", 15, false);
    }
}
