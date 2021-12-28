package main.java.Task4.Fruit;

public abstract class Fruit {
    protected String color;
    protected Number weight;

    public Fruit(String color, Number weight){
        this.color = color;
        this.weight = weight;
    };

    public Number getWeight() {
        return weight;
    }
}
