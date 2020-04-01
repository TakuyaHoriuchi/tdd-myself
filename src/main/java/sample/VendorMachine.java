package sample;

import java.util.List;

public interface VendorMachine {

    void insertCoin(Coin coin);

    PurchaseResult pushButton(DrinkType drinkType);

    List<Coin> returnMoney();

    void refillDrink();
}
