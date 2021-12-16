/**
 * Java 1. Homework #3
 *
 * @author Sergey Shchukin
 * @version 16.12.2021
 *
 */

import java.util.Arrays;
import java.util.Random;

class ThirdLesson {
    public static void main(String[] args) {
        InvertArray();
        FillNumbers();
        MultiplyingNumber();
        SquareArray();
        LongArray();
    }


    //  Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static int[] InvertArray() {
        int[] arr1 = {0, 1, 1, 0, 0, 1, 0, 1};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1 - arr1[i]; 
        } 
        System.out.println(Arrays.toString(arr1));
    }


    //  Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    static int[] FillNumbers() {
        int[] arr2 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));
    }


    //  Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static int[] MultiplyingNumber() {
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 6 ;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
    

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];  
    static int[] SquareArray() {
        int[][] arr4 = {{ 1, 2, 1 }, {3, 1, 4}, {1, 6, 1}};
        System.out.println(Arrays.toString(arr4));
    }
    

    //Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    static int[] LongArray(int len, int initialValue) {
        int[] arr5 = new int[len];
        Arrays.fill(arr5, initialValue);
     return arr5;   
    }
}