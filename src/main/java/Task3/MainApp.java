package main.java.Task3;



/**
         1. Создайте исключения: MyArraySizeException (неправильный размер массива), и
         MyArrayDataException (в ячейке массива лежит что-то не то);

         2. Напишите метод, на вход которого подаётся двумерный строковый массив (String[][]) размером
         4×4. При подаче массива другого размера необходимо бросить исключение
         MyArraySizeException.

         3. Далее метод должен пройтись по всем элементам массива, преобразовать в int и
         просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
         ячейке лежит символ или текст вместо числа), должно быть брошено исключение
         MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные. Расчет
         данных для этой матрицы прекращается.

         4. В методе main() нужно вызвать полученный метод, обработать возможные исключения
         MySizeArrayException и MyArrayDataException и вывести результат расчёта.

 **/


public class MainApp {
    public void checkingArray(String[][] arr){
        int row = 0;
        int column = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }
                column++;
            }
            row++;
        }
        if (!(row == 4 && column == 16)) {
            throw new MyArraySizeException();
        }

    }
    public static void main(String[] args) {
        MainApp app = new MainApp();
        String arr[][] = {
                {"1","2","3","4"},
                {"1","1","3","1"},
                {"1","2","1","4"},
                {"1","2","3","4"},
        };
        app.checkingArray(arr);
    }
}
