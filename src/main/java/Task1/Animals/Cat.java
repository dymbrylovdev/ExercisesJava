package main.java.Task1.Animals;

public class Cat extends Animal {
    public Cat(int run, int sail,String name) {
        super(run, sail, name);
    }

    @Override
    public void setRun(int run) {
        if (run <= 200) {
            this.run = run;
            System.out.println(this.name + " пробежал " + run + " м");
        } else {
            System.out.println("Превышает ограничения 200 м");
        }
    }

    @Override
    public void setSail(int run) {
        System.out.println("Не умеет плавать!");
    }

    @Override
    public void getRun() {
        System.out.println(this.run);
    }

    @Override
    public void getSail() {
        System.out.println(this.sail);
    }
}
