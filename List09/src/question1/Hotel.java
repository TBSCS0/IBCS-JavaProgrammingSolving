package question1;

public class Hotel {
    public static void main(String[] args) {
        Room room1 =  new Room(2, 250);
        Room room2 =  new Room(4, 500);
        Room room3 =  new Room(3, 375);

        System.out.println(room3.getValue());
        room2.setValue(600);
        room1.setValue(300);
        System.out.println(room1.getValue());

        System.out.println(room1.roomPriceAverage());
    }
}
