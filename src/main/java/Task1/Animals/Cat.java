package main.java.Task1.Animals;

public class Cat extends Animal {
    public static int count;

    public Cat(String name, int maxRunDistance) {
        super(name, "Кот", maxRunDistance, 0);
        count++;
    }
}
