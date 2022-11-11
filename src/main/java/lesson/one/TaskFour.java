// Реализуйте метод, принимающий в качестве аргументов два целочисленных
// массива, и возвращающий новый массив, каждый элемент которого равен
// частному элементов двух входящих массивов в той же ячейке. Если длины
// массивов не равны, необходимо как-то оповестить пользователя. Важно: При
// выполнении метода единственное исключение, которое пользователь может увидеть
// - RuntimeException, т.е. ваше.

package lesson.one;

import java.util.Arrays;

public class TaskFour {
    public static void main(String[] args) {
        double[] numbersOne = {1, 3, 5, 7, 3, 4};
        double[] numbersTwo = {1, 5, 7, 3, 5};
        System.out.println(Arrays.toString(differenceTwoArrays(numbersOne, numbersTwo)));
    }

    public static double[] differenceTwoArrays(double[] numbersOne, double[] numbersTwo) {
        if (numbersOne.length != numbersTwo.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        double[] result = new double[numbersOne.length];
        for (int i = 0; i < numbersOne.length; i++) {
            result[i] = Math.round((numbersOne[i] / numbersTwo[i]) * 100d) / 100d;
        }
        return result;
    }
}
