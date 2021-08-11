package lesson3;

import java.awt.desktop.AboutEvent;
import java.util.Arrays;

public class theThirdApp {

    public static void main(String[] args) {

        /**
         * Задание 1
         * arrWithReplacement - замена нулей на единицы
         */
        int[] arrWithReplacement = new int []{1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arrWithReplacement.length; i++) {
            if (arrWithReplacement[i] == 0) {
                arrWithReplacement[i] = 1;
            } else  {
                arrWithReplacement[i] = 0;
            }
        }

        /**
         * Задание 2
         * fromOneToHundred массив размерностью 100 заполненный числами по порядку
         */
        int [] fromOneToHundred = new int[100];
        for (int i = 1; i < fromOneToHundred.length; i++) {
            fromOneToHundred[i] = i;
        }

        /**
         * Задание 3
         * Умножение на 2 чисел меньше 6
         */
        int [] doubleIfLessThanSix = new int []{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < doubleIfLessThanSix.length; i++) {
            if (doubleIfLessThanSix[i] < 6) {
                doubleIfLessThanSix[i] = doubleIfLessThanSix[i] * 2;
            }
        }

        /**
         * Задание 4
         * Двумерный квадратный массив из нулей с единицами на главных диагоналях
         */
        int lenArray = 10;
        int [][] diagonalГnits = new int [lenArray][lenArray];
        for (int i = 0; i < diagonalГnits.length; i++) {
            for (int j = 0; j < diagonalГnits[i].length; j++){
                if (i == j) {
                    diagonalГnits[i][j] = 1;
                } else if (i + j == lenArray - 1){
                    diagonalГnits[i][j] = 1;
                }
            }
        }

        /**
         * Задание 6*
         * Поиск максимального и минимального значения в массиве
         */

        int [] minAndMax = new int[]{4,5,6,9,78,1,2,3,9,9,4,3,11,5,46};
        int min = 0;
        int max = 0;
        for (int i = 0; i < minAndMax.length; i++) {
            if (minAndMax[i] < min) {
                min = minAndMax[i];
            } else if (minAndMax[i] > max){
                max = minAndMax[i];
            }
        }

        /**
         * Задание 6*
         * Альтернативное решение
         */
        int [] maxAndMin = new int[]{4,5,6,9,78,1,2,3,9,9,4,3,11,5,46};
        Arrays.sort(maxAndMin);
        int minimal = maxAndMin[0];
        int maximal = maxAndMin[maxAndMin.length -1];


        uniformArray(6,11);


        int [] checkBalance = {2,2,2,2,2,10,6};
        System.out.println(equalAmounts(checkBalance));
        //bias(checkBalance, 1);


    }

    /**
     * Задание 5
     * Возвращает одномерный массив длинной len и со значениями initialValue
     */

    public static void uniformArray(int len, int initialValue){
        int [] uniformArray = new int [len];
        Arrays.fill(uniformArray, initialValue);
        System.out.println(Arrays.toString(uniformArray));
    }

    /**
     * Задание 7**
     * Проверка равенства суммы элементов двух частей
     */

    public static boolean equalAmounts(int[] arr){
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            left = left + arr[i];
            int right = 0;
            for (int j = (arr.length - 1); j > i; j--) {
                right = right + arr[j];
            }
            if (right == left){
                return true;
            }
        }
        return false;
    }

    /**
     * Задание 8*** до которого я что-то не додумался. Попробую разобрать как нибудь на досуге
     * Смещение массива на заданное число
     */
    //public static void bias(int[] arr, int len){
    //        int j = 0;
    //    while (j < arr.length) {
    //        int i = 0;
//
    //        arr[i + len] = arr[i];
    //        j++;
    //    }
    //    System.out.println(Arrays.toString(arr));
    //}
}
