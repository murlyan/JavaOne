package lesson3;

import java.awt.desktop.AboutEvent;
import java.util.Arrays;

public class theThirdApp {

    public static void main(String[] args) {


        int[] arrWithReplacement = new int []{1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arrWithReplacement.length; i++) {
            if (arrWithReplacement[i] == 0) {
                arrWithReplacement[i] = 1;
            } else  {
                arrWithReplacement[i] = 0;
            }
        }


        int [] fromOneToHundred = new int[100];
        for (int i = 1; i < fromOneToHundred.length; i++) {
            fromOneToHundred[i] = i;
        }

        int [] doubleIfLessThanSix = new int []{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < doubleIfLessThanSix.length; i++) {
            if (doubleIfLessThanSix[i] < 6) {
                doubleIfLessThanSix[i] = doubleIfLessThanSix[i] * 2;
            }
        }

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

        uniformArray(6,11);

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

        int [] checkBalance = {2,2,2,2,2,10};
        int [] checkBalance2 = new int[]{2,2,2,2,10};
        int [] checkBalance3 = new int[]{2,2,2,2,2,18,10,9,9};
        equalAmounts(checkBalance);
        //equalAmounts(checkBalance2);
        //equalAmounts(checkBalance3);
    }

    public static void uniformArray(int len, int initialValue){
        int [] uniformArray = new int [len];
        Arrays.fill(uniformArray, initialValue);
        System.out.println(Arrays.toString(uniformArray));
    }

    public static boolean equalAmounts(int[] mass){
        boolean middle = false;
        int left = 0;
        for (int i = 0; i < mass.length; i++) {
            left = left + mass[i];
            int right = 0;
            for (int j = mass.length; j > i; i--) {
                right = right + mass[j];
                if (right == left){
                    middle = true;
                }
            }
        }
        if (middle = true){
            return true;
        } else return false;
    }
}
