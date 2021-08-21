package lesson6;

public abstract class Animals {
    protected String name;
    static int animalCount;

    public Animals(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int sailDefault();

    public abstract int runDefault();

    public void sail(int distance) {
        if (distance > sailDefault()) {
            System.out.println(name + " решил не плыть (︶︹︺)");
        } else {
            System.out.println(name + " проплыл " + distance + " м.");
        }
    }
    public void run(int distance) {
        if (distance > runDefault()) {
            System.out.println(name + " не добежал и прилег отдохнуть на " + distance + "-метровке (－ω－) zzZ");
        } else {
            System.out.println(name + " пробежал " + distance + " м.");
        }
    }
}
