package q1;

import java.util.Random;

public class Dice {
    int generateD4(int d4faces){
        Random random = new Random();
        return random.nextInt(d4faces) + 1;
    }

    void generateD6(int d6faces){

    }

    void generateD20(){

    }
}
