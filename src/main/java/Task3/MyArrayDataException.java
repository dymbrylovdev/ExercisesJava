package main.java.Task3;

public class MyArrayDataException extends RuntimeException{

    public MyArrayDataException(int i, int j){
        super("Is not number in row="+(i+1)+", column="+(j+1));
    }
}
