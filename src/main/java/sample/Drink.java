package sample;

public class Drink {
    private DrinkType drinkType;

    public Drink(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public DrinkType getType() {
        return drinkType;
    }
}
