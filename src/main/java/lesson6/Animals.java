package lesson6;

public class Animals{
    protected String name;
    protected int sail;
    protected int run;

    public Animals(String name, int sail, int run) {
        this.name = name;
        this.sail = sail;
        this.run = run;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSail() {
        return sail;
    }

    public int getRun() {
        return run;
    }

    public void distanceSail(int distance) {
        if (distance < sail) {
            System.out.println(name + " решил не плыть (︶︹︺)");
        } else {
            System.out.println(name + "проплыл" + distance + "метров");
        }
    }
    public void distanceRun(int distance) {
        if (distance < run) {
            System.out.println(name + " прилег отдохнуть (－ω－) zzZ");
        } else {
            System.out.println(name + "проплыл" + distance + "метров");
        }
    }
}
