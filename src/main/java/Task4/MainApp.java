package main.java.Task4;

import main.java.Task4.Fruit.Apple;
import main.java.Task4.Fruit.Fruit;
import main.java.Task4.Fruit.Orange;

import javax.print.attribute.standard.OrientationRequested;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {

    /**
     1. Написать метод, который меняет два элемента массива местами (массив может быть любого
     ссылочного типа).

     2. Написать метод, который преобразует массив в ArrayList.

     3. Задача:
             a. Даны классы Fruit -> Apple, Orange.

             b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
             фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины.

             c. Для хранения фруктов внутри коробки можно использовать ArrayList.

             d. Написать метод getWeight(), который высчитывает вес коробки. Задать вес одного
             фрукта и их количество: вес яблока — 1.0f, апельсина — 1.5f (единицы измерения не
             важны).

             e. Внутри класса Box написать метод Compare, который позволяет сравнить текущую
             коробку с той, которую подадут в Compare в качестве параметра. True, если их массы
             равны, False — в противном случае. Можно сравнивать коробки с яблоками и
             апельсинами.

             f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
             Помним про сортировку фруктов: нельзя высыпать яблоки в коробку с апельсинами.
             Соответственно, в текущей коробке фруктов не остаётся, а в другую перекидываются
             объекты, которые были в первой.

             g. Не забываем про метод добавления фрукта в коробку.
     */


    public static void main(String[] args) {
        Orange orange = new Orange("Ораньжевый",1.5f);
        Orange orange1 = new Orange("Ораньжевый",1.6f);
        Apple apple = new Apple("Зеленный",1.0f);

        Box<Orange> box1 = new Box<>(orange);
        box1.addObj(orange1);
        box1.addObj(orange1);

        Box<Orange> box2 = new Box<>();
        box2.addObj(orange);
        box2.addObj(orange);
        box2.addObj(orange);

        Box<Apple> box3 = new Box<>(apple);

        box2.transpose(box1);
    }
}
