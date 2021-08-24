package lesson7;

public class Plate {
    private int amountOfFood;

    public Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    /**
     * Уменьшить количество еды в тарелке.
     * @param amount сколько съели
     */
    public void decreaseAmountOfFood(int amount){
        this.amountOfFood -= amount;
    }

    /**
     * Насыпать еду в тарелку.
     * @param food сколко добавили
     */
    public void pourFood(int food){
        this.amountOfFood += food;
    }


    @Override
    public String toString() {
        return "Plate{" +
                "amountOfFood=" + amountOfFood +
                '}';
    }
}
