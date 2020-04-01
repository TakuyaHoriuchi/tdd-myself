package sample;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;


class VendingMachineTest {

    @Test
    void purchaseCoffee() {

        //GIVEN
        VendingMachine vendingMachine = new VendingMachineImpl();

        //WHEN
        vendingMachine.insertCoin(new HundredCoin());

        PurchaseResult purchaseResult = vendingMachine.pushButton(DrinkType.coffee);

        //THEN
        assertThat(purchaseResult.getDrink().getType()).isEqualTo(DrinkType.coffee);
        assertThat(purchaseResult.getCoins()).isEmpty();
    }

    @Test
    void purchaseTea() {

        //GIVEN
        VendingMachine vendingMachine = new VendingMachineImpl();

        //WHEN
        vendingMachine.insertCoin(new HundredCoin());
        vendingMachine.insertCoin(new FiftyCoin());

        PurchaseResult purchaseResult = vendingMachine.pushButton(DrinkType.tea);

        //THEN
        assertThat(purchaseResult.getDrink().getType()).isEqualTo(DrinkType.tea);
        assertThat(purchaseResult.getCoins()).isEmpty();
    }

}