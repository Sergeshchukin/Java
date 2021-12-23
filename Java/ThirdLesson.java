/**
 * Java 1. Homework #3
 *
 * @author Sergey Shchukin
 * @version 18.12.2021
 *
 */

import java.util.Arrays;

public class ThirdLesson {
    public static void main(String[] agrs) {
//1
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertarr(arr);
        System.out.println(Arrays.toString(arr));
//2
        int[] array;
        array = new int[100];
        fillarr(array);
        System.out.println(Arrays.toString(array));
//3
        int[] multiarr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiArr(multiarr);
        System.out.println(Arrays.toString(multiarr));
//4
        int[][] matrix;
        matrix = new int[3][3];
        massive(matrix);
//5
        int[] metod;
        metod = mass(12, 5);
        System.out.println(Arrays.toString(metod));
    }

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    public static void invertarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }


// 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void fillarr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1);
        }
    }
// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void multiArr(int[] multiarr) {
        for (int i = 0; i < multiarr.length; i++) {
            if (multiarr[i] < 6) {
                multiarr[i] *= 2;
            }
        }
    }
//  4.    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
// то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void massive(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 2;
                if (i == j) {
                    matrix[i][j] = 1;
                }
                if (i == n - j - 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

//5 Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
// типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] mass(int len, int initialValue) {
        int[] metod;
        metod = new int[len];
        for (int i = 0; i < metod.length; i++) {
            metod[i] = initialValue;
        }
        return metod;
    }
}
