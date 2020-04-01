package sample;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {

    List<Coin> coins = new ArrayList<>();

    @Override
    public void insertCoin(Coin coin) {
    }

    @Override
    public PurchaseResult pushButton(DrinkType drinkType) {
        Drink drink = new Drink(drinkType);

        return new PurchaseResult(drink, coins);
    }

    @Override
    public List<Coin> returnMoney() {
        return null;
    }

    @Override
    public void refillDrink() {

    }
}
