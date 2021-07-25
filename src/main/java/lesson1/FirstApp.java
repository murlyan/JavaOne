package lesson1;

public class FirstApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple\n");
    }

    public static void checkSumSign(){
        int a = 12;
        int b = -22;
        int s = a + b;
        if (s >= 0) {
            System.out.println("Сумма положительная\n");
        } else {
            System.out.println("Сумма отрицательная\n");
        }
    }

    public static void printColor(){
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный\n");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый\n");
        } else {
            System.out.println("Зеленый\n");
        }
    }

    public static void compareNumbers(){
        int a = 0;
        int b = 1;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
