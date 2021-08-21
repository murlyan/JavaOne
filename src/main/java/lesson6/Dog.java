package lesson6;

public class Dog extends Animals{
    static int dogCount;
    //private String breed;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public int sailDefault() {
        return 10;
    }

    @Override
    public int runDefault() {
        return 500;
    }

    @Override
    public void sail(int distance) {
        int Default = sailDefault();
        super.sail(distance);
    }

    @Override
    public void run(int distance) {
        int Default = runDefault();
        super.run(distance);
    }
}
