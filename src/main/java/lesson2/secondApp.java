package lesson2;

public class secondApp {
    public static void main(String[] args) {
        checkSumm(10, 2);
        checkPositive(-1);
        printPositive(-1);
        printStr("Privet", -3);
        leapYear(2000);
    }

    public static boolean checkSumm(int a, int b) {
        if (a + b >= 10 & a + b <= 20){
            return true;
        } else {
            return false;
        }
    }

    public static void printPositive (int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean checkPositive(int a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printStr(String a, int b) {
        int c = 0;
        while (c < b) {
            System.out.println(a);
            c ++;
        }
    }

    public static boolean leapYear(int a) {
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}
