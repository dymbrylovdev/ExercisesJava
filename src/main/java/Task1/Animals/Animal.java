package main.java.Task1.Animals;

public abstract class Animal {
    public static int count;
    
    String name;
    String type;

    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String name, String type, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.name = name;
        this.type = type;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance){
        if (distance <= maxRunDistance){
            System.out.println(type+" "+name+" "+"смог справиться с забегом!");
        }else {
            System.out.println(type+" "+name+" "+"не смог справиться с забегом!");
        }
    }


    public void swim(int distance){
        if (maxSwimDistance == 0){
            System.out.println(type+" "+name+" "+"Не умеет плавать!");
            return;
        }
        if (distance <= maxSwimDistance){
            System.out.println(type+" "+name+" "+"смог справиться с заплывом!");
        }else {
            System.out.println(type+" "+name+" "+"не смог справиться с заплывом!");
        }
    }
}
