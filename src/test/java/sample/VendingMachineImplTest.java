package sample;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VendingMachineImplTest {

    @Test
    void purchaseCoffee() {

        //GIVEN
        VendingMachine vendingMachine = new VendingMachineImpl();

        //WHEN
        vendingMachine.insertCoin(new HundredCoin());

        PurchaseResult purchaseResult = vendingMachine.pushButton(DrinkType.COFFEE);

        //THEN
        assertThat(purchaseResult.getDrink().getType()).isEqualTo(DrinkType.COFFEE);
        assertThat(purchaseResult.getCoins()).isEmpty();
    }

    @Test
    void purchaseTea() {

        //GIVEN
        VendingMachine vendingMachine = new VendingMachineImpl();

        //WHEN
        vendingMachine.insertCoin(new HundredCoin());
        vendingMachine.insertCoin(new FiftyCoin());

        PurchaseResult purchaseResult = vendingMachine.pushButton(DrinkType.TEA);

        //THEN
        assertThat(purchaseResult.getDrink().getType()).isEqualTo(DrinkType.TEA);
        assertThat(purchaseResult.getCoins()).isEmpty();
    }

}