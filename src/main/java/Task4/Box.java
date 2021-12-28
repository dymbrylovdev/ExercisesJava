package main.java.Task4;


import main.java.Task4.Fruit.Fruit;
import main.java.Task4.Fruit.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Box<T> {
    private ArrayList<T> arrayList ;

    public Box() {
        this.arrayList = new ArrayList<>();
    }
    public Box(T obj) {
        this.arrayList = new ArrayList<>();
        this.arrayList.add(obj);
    }

    public int getWeight() {
        try {
            double sum = 0;
            for (int i = 0; i < this.arrayList.size(); i++) {
                if (this.arrayList.get(i) instanceof Fruit) {
                    Fruit fruit = (Fruit)this.arrayList.get(i);
                    Number weight = fruit.getWeight();
                    sum += weight.doubleValue();
                }
            }
            return (int)sum;
        } catch (IndexOutOfBoundsException e) {
            return 0;
        }
    }

    public void transpose(Box box){

        if (this.arrayList.size()==0){
            System.out.println("В этой коробке пусто");
        }else if(box.getBox()==null){
            for (int i = 0; i < this.arrayList.size(); i++) {
                T elem = this.arrayList.get(i);
                box.arrayList.add(elem);
            }
            for (int j = this.arrayList.size()-1; j >= 0; j--) {
                this.arrayList.remove(j);
            }
            System.out.println("Тперь в основной коробке осталось: "+this.arrayList.size()+" фруктов");
            System.out.println("В ту которую переложиле все фрукты теперь: "+box.arrayList.size()+" фруктов");
        }else if (box.getBox().getClass().getSimpleName()==getBox().getClass().getSimpleName()){
            for (int i = 0; i < this.arrayList.size(); i++) {
                T elem = this.arrayList.get(i);
                box.arrayList.add(elem);
            }
            for (int j = arrayList.size()-1; j >= 0; j--) {
                this.arrayList.remove(j);
            }
            System.out.println("Тперь в основной коробке осталось: "+arrayList.size()+" фрукта");
            System.out.println("В ту которую переложиле все фрукты теперь: "+box.arrayList.size()+" фрукта");

        }else {
            System.out.println("Не та коробка фруктов");
        }
    }

    public boolean compare(Box box){
        if (this.getWeight() == box.getWeight()){
            return true;
        }else {
            return false;
        }
    }


    public void addObj(T newObj) {
        this.arrayList.add(newObj);
    }

    public ArrayList<T> getArrayList() {
        return this.arrayList;
    }

    public T getBox() {
        if (this.arrayList.size()==0){
            return null;
        }else {
            return this.arrayList.get(0);
        }
    }
}
