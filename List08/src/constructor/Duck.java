package constructor;

public class Duck {
    String name;
    int age;
    boolean hasQuack;

    Duck(){}

    Duck(String name, int age, boolean hasQuack){
        this.name = name;
        this.age = age;
        this.hasQuack = hasQuack;
    }
}
