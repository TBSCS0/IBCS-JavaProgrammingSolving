package q1;

public class Game {
    public static void main(String[] args) {
        Dice dice = new Dice();

        System.out.println(dice.generateD4(4));
        dice.generateD6(6);
    }
}
