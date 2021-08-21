package lesson6;

public class AnimalsApp {
    public static void main(String[] args) {
        Cat catMurzik = new Cat("Мурзик");
        Dog dogBarbos = new Dog("Барбос");
        Dog dogCharly = new Dog("Чарли");


        catMurzik.run(100);
        dogBarbos.run(501);
        catMurzik.sail(2);
        dogBarbos.sail(2);
        dogCharly.sail(10);

        System.out.println("Было создано " + Animals.getAnimalCount() + " животных");
        System.out.println("Котов существует: " + Cat.getCatCount());
        System.out.println("Собак существует: " + Dog.getDogCount());
    }
}
