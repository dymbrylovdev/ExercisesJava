package main.java.Task4;

import java.util.ArrayList;

public class Change <T>{
    private T arr[];

    public void getArr() {
        for(T i:arr){
            System.out.print(i+" ");
        }
    }
    public Change(T... arr){
        this.arr = arr;
    }
    public ArrayList<T> Convert(T[] arr){
        ArrayList<T> arrayList = new ArrayList<>();
        for (T i : this.arr){
            arrayList.add(i);
        }
        return arrayList;
    }

    public void rev(int i, int j ) {
        T elem = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = elem;
    }

}
