// Реализуйте метод, принимающий в качестве аргументов два целочисленных
// массива, и возвращающий новый массив, каждый элемент которого равен разности
// элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.

package lesson.one;

import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args) {
        int[] numbersOne = {1, 3, 5, 7, 3, 4};
        int[] numbersTwo = {1, 5, 7, 3, 5};
        System.out.println(Arrays.toString(differenceTwoArrays(numbersOne, numbersTwo)));
    }

    public static int[] differenceTwoArrays(int[] numbersOne, int[] numbersTwo) {
        if (numbersOne.length != numbersTwo.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        int[] result = new int[numbersOne.length];
        for (int i = 0; i < numbersOne.length; i++) {
            result[i] = numbersOne[i] - numbersTwo[i];
        }
        return result;
    }
}
