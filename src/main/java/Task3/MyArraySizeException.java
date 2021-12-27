package main.java.Task3;

public class MyArraySizeException extends RuntimeException{

    public MyArraySizeException(){
            super("Не верный размер массива: row!=4, column!=4");
        }
}
