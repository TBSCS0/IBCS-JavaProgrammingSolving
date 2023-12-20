package question1;


import java.util.Random;

public class DiceController {
    private char label;
    private Dice dice;

    private Random random;

    public DiceController(){
        random = new Random();
        label = 'A';
    }

    public Dice generateNumber(int x){
        dice = new Dice(label,random.nextInt(x));
        label++;
        return dice;
    }

    public Dice generateNumber(int x, int y){
        dice = new Dice(label,random.nextInt((y-x)+x));
        label++;
        return dice;
    }
}
