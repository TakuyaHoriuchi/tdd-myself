package sample;

import java.util.List;

public interface VendingMachine {

    void insertCoin(Coin coin);

    PurchaseResult pushButton(DrinkType drinkType);

    List<Coin> returnMoney();

    void refillDrink();
}
