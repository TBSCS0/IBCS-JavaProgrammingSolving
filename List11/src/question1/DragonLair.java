package question1;

public class DragonLair {
    public static void main(String[] args) {
        DiceController diceController = new DiceController(); // constructor will start with A

        Dice dice1 = diceController.generateNumber(6); // will put A and change to B
        Dice dice2 = diceController.generateNumber(6);
        Dice dice3 = diceController.generateNumber(6);

        System.out.println(dice1.getLabel() + ": " + dice1.getNumber());
        System.out.println(dice2.getLabel() + ": " + dice2.getNumber());
        System.out.println(dice3.getLabel() + ": " + dice3.getNumber());
    }
}
