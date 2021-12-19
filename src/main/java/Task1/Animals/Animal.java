package main.java.Task1.Animals;

public abstract class Animal {
    String name;
    int run;
    int sail;

    public Animal(int run, int sail, String name) {
        this.name = name;
        this.run = run;
        this.sail = sail;
    }

    public abstract void setRun(int run);
    public abstract void setSail(int sail);
    public abstract void getRun();
    public abstract void getSail();

}
