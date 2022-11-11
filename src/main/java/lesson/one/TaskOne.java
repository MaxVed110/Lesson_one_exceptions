package lesson.one;

import java.util.Arrays;

public class TaskOne {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 2, 4, 8, 5};
        System.out.println(TaskOne.convertLetterToNumber("12s3")); // NumberFormatException
        System.out.println(Arrays.toString(TaskOne.arraySort(numbers))); // ArrayIndexOutOfBoundsException
        System.out.println(TaskOne.dividingNumbers(3, 0)); // ArithmeticException
    }
    public static int convertLetterToNumber(String stringNumber) {
        return Integer.parseInt(stringNumber);
    }

    public static int[] arraySort(int[] numbers) {
        for (int left = 0; left < numbers.length; left++) {
            int minInd = left;
            for (int i = left; i <= numbers.length; i++) {
                if (numbers[i] < numbers[minInd]) {
                    minInd = i;
                }
            }
            int tmp = numbers[left];
            numbers[left] = numbers[minInd];
            numbers[minInd] = tmp;
        }
        return numbers;
    }

    public static int dividingNumbers(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }
}
