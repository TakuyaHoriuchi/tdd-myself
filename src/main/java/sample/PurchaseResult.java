package sample;

import java.util.List;

public class PurchaseResult {

    public PurchaseResult(Drink drink, List<Coin> coins) {
        this.drink = drink;
        this.coins = coins;
    }

    private Drink drink;

    private List<Coin> coins;


    public Drink getDrink() {
        return drink;
    }

    public List<Coin> getCoins() {
        return coins;
    }


}
