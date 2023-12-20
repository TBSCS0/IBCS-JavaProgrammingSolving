package question1;

public class DragonLair {
    public static void main(String[] args) {
        DiceController diceController = new DiceController();
        Dice d1 = diceController.generateNumber(10);
        Dice d2 = diceController.generateNumber(10);

        System.out.println( d1.getLabel() + " " + d1.getNumber());
        System.out.println( d2.getLabel() + " " + d2.getNumber());
    }
}
