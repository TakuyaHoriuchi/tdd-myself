package sample;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;


class VendorMachineTest {

    @Test
    void purchaseCoffee() {

        //GIVEN
        VendorMachine vendorMachine = new VendorMachineImpl();

        //WHEN
        vendorMachine.insertCoin(new HundredCoin());

        PurchaseResult purchaseResult = vendorMachine.pushButton(DrinkType.coffee);

        //THEN
        assertThat(purchaseResult.getDrink().getType()).isEqualTo(DrinkType.coffee);
        assertThat(purchaseResult.getCoins()).isEmpty();
    }

    @Test
    void purchaseTea() {

        //GIVEN
        VendorMachine vendorMachine = new VendorMachineImpl();

        //WHEN
        vendorMachine.insertCoin(new HundredCoin());
        vendorMachine.insertCoin(new FiftyCoin());

        PurchaseResult purchaseResult = vendorMachine.pushButton(DrinkType.tea);

        //THEN
        assertThat(purchaseResult.getDrink().getType()).isEqualTo(DrinkType.tea);
        assertThat(purchaseResult.getCoins()).isEmpty();
    }

}