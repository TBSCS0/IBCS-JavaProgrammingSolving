package demo;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Square square1 = new Square("green",100, 1);
        Square square2 = new Square("blue",0, 20);

        System.out.println("Your " + square.color +
                " square is " + square.thickness +
                " thick.");
        System.out.println("Your " + square1.color +
                " square is " + square1.thickness +
                " thick.");

    }
}
