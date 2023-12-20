package question1;

public class Room {
    private int numberOfGuests;
    private double value;

    public Room(int numberOfGuests, double value) {
        this.numberOfGuests = numberOfGuests;
        this.value = value;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double roomPriceAverage(){
        return value/numberOfGuests;
    }
}
