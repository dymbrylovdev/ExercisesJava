package main.java.Task1;

//        1. Создать классы Собака, Домашний Кот, Тигр, Животное (можете добавить два-три своих
//        класса).
//        2. Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина
//        препятствия.
//        3. У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м;
//        плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет
//        печать в консоль. Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.


import main.java.Task1.Animals.Animal;
import main.java.Task1.Animals.Cat;
import main.java.Task1.Animals.Dog;

public class Programs {

    public static void main(String[] args) {
        Animal[] animals =  {
                new Cat("Снежок",200),
                new Dog("Шарик", 500, 10)
        };
        for (Animal a : animals){
            a.run(1000);
            a.swim(100);
        }
    }
}



