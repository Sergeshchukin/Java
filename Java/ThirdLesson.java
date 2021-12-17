/**
 * Java 1. Homework #3
 *
 * @author Sergey Shchukin
 * @version 17.12.2021
 *
 */

import java.util.Arrays;

public class ThirdLesson {
    public static void main(String[] agrs) {

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        fillArr1(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2;
        arr2 = new int[100];
        fillArray2(arr2);
        System.out.println(Arrays.toString(arr2);

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        fillArr3(arr3);
        System.out.println(Arrays.toString(arr3));

        int[][] doubleArr = new int[3][3];
        fillArr4(doubleArr);

        int[] arr5 = fillArr5(12, 5);
        System.out.println(Arrays.toString(arr5));

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        static void fillArr1 ( int[] arr1) {

            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] == 1) {
                    arr1[i] = 0;
                } else {
                    arr1[i] = 1;
                }
            }
        }


// 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

        static void fillArray2 ( int[] arr2){

            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = (i);
            }
        }
// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        static void fillArr3 ( int[] arr3){

            for (int i = 0; i < arr3.length; i++) {

                if (arr3[i] < 6) {
                    arr3[i] *= 2;
                }
            }
        }
//  4.    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
// то есть [0][0], [1][1], [2][2], …, [n][n];

        static void fillArr4 ( int[][] doubleArr){
            int n = doubleArr.length;
            for (int i = 0; i < doubleArr.length; i++) {
                for (int j = 0; j < doubleArr[i].length; j++) {
                    doubleArr[i][j] = 2;
                    if (i == j) {
                        doubleArr[i][j] = 1;
                    }
                    if (i == n - j - 1) {
                        doubleArr[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < doubleArr.length; i++) {
                System.out.println(Arrays.toString(doubleArr[i]));
            }
        }
//5 Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
// типа int длиной len, каждая ячейка которого равна initialValue;

        static int[] fillArr5 ( int len, int initialValue) {
            int[] arr5;
            arr5 = new int[len];
            for (int i = 0; i < arr5.length; i++) {
                arr5[i] = initialValue;
            }
            return arr5;
        }
}
