package lesson7;

/**
 * Кот голодный, хочет поесть. Поесть он может из тарелки
 */
public class App {
    public static void main(String[] args) {
        Plate plate = new Plate(50);
        Cat [] cats = new Cat[5];
        cats[0] = new Cat("Vaska", 15, false);
        cats[1] = new Cat("Anton", 11, false);
        cats[2] = new Cat("Igor", 5, false);
        cats[3] = new Cat("Valera", 35, false);
        cats[4] = new Cat("Boris", 15, false);

        StringBuilder sat = new StringBuilder();
        StringBuilder notSat = new StringBuilder();
        sat.append("Список голодненьких котов: ");
        notSat.append("Список сытеньких котов: ");
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);


            if (!cats[i].isSatiety()) {
                sat.append("\n").append(cats[i].getName());
            } else {
                notSat.append("\n").append(cats[i].getName());
            }

        }
        System.out.println(notSat);
        System.out.println(sat);
        plate.pourFood(11);
        System.out.println("В тарелке осталось " + plate.getAmountOfFood() + " еды.");
    }
}
