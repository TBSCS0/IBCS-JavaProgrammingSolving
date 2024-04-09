package q1;

import java.util.Random;

public class Dice {
    Random random;

    Dice(){
        random = new Random();
    }

    int generateD4(int d4faces){
        return random.nextInt(d4faces)+1;
    }

    void generateD6(int d6faces){
        System.out.println(random.nextInt(d6faces)+1);
    }

    void generateD20(){
        System.out.println(random.nextInt(20)+1);
    }
}
