package lesson6;

public class Cat extends Animals{
    static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public int sailDefault() {
        return 0;
    }

    @Override
    public int runDefault() {
        return 200;
    }

}
