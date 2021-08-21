package lesson6;

public class Cat extends Animals{

    public Cat(String name, int sail, int run) {
        super(name, sail, run);
        this.run = 200;
        this.sail = 0;
    }
}
