package main.java.Task1.Animals;

public class Dog extends Animal {
    public static int count;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, "Собака", maxRunDistance, maxSwimDistance);
        count++;
    }
}
