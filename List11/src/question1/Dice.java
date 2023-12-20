package question1;

public class Dice {
    private char label;
    private int number;

    public Dice(char label, int number) {
        this.label = label;
        this.number = number;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
