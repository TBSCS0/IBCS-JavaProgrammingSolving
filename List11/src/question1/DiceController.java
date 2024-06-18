package question1;

import java.util.Random;

public class DiceController {
    private char label;
    private Dice dice;
    private Random random;

    public DiceController() {
        random = new Random();
        label = 'A';
    }

    public Dice generateNumber(int x){
        int number = random.nextInt(x+1);
        dice = new Dice(label, number);
        label++;
        return dice;
    }

//    public Dice generateNumber(int x, int y){
//        return null;
//    }


}
