package ru.geekbrains.oskindi;

public class MainApp {

    public static void main(String[] args) {

        String[][] arr = {{"1", "4", "6", "3", "4"},
                          {"4", "2", "6", "7", "8"},
                          {"9", "4", "3", "5", "2"},
                          {"3", "1", "1", "6", "8"},
                          {"2", "8", "3", "6", "7"}};

        String[][] arr2 = {{"1", "4", "6", "3"},
                           {"4", "2", "6", "7"},
                           {"9", "g", "3", "5"},
                           {"3", "1", "1", "6"}};

        try {
            System.out.println(summArray(arr));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(summArray(arr2));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    public static int summArray(String[][] str) throws MyArraySizeException {
        int summ = 0;
        int numberArray;
        if (str.length != 4 || str[0].length != 4) {
            throw new MyArraySizeException("Размер массива не равен 4");
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[0].length; j++) {
                try {
                    numberArray = Integer.parseInt(str[i][j]);
                } catch (NumberFormatException e) {
                    try {
                        throw new MyArrayDataException(str[i][j], i, j);
                    } catch (MyArrayDataException myArrayDataException) {
                        myArrayDataException.printStackTrace();
                        numberArray = 0;
                    }
                }
                summ += numberArray;
            }
        }
        return summ;
    }
}
