package sample;

public class VendorMachine {

    public Drink purchase(int money, String drinkName) {
        return new Drink();
    }

    public class Drink {
        public String getName() {
            return "coffee";
        }
    }
}
