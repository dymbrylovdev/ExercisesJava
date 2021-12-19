package main.java.Task1.Animals;

public class Dog extends Animal{
    public Dog(int run, int sail, String name){
        super(run, sail, name);
    }

    @Override
    public void setRun(int run){
        if (run<=500){
            this.run = run;
            System.out.println(this.name + " пробежал " + run + " м");
        }else {
            System.out.println("Превышает ограничения 200 м");
        }
    }

    @Override
    public void setSail(int sail) {
        if (sail<=10){
            this.sail = sail;
            System.out.println(this.getClass().getName() + "проплыл" + sail);
        }else {
            System.out.println("Превышает ограничения 10 м");
        }
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
