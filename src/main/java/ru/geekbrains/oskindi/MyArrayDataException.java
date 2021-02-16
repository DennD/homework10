package ru.geekbrains.oskindi;

public class MyArrayDataException extends RuntimeException{
    private int indx_i;
    private int indx_j;
    private String value;


    public MyArrayDataException(String value, int indx_i, int indx_j) {
        super("Массив содержит некорректный элемент '"+value+"' на позиции ["+indx_i+","+indx_j+"]");
        this.indx_i = indx_i;
        this.indx_j = indx_j;
    }

}
