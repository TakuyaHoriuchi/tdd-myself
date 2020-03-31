package sample;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;


class VendorMachineTest {

    @Test
    void test(){

        //GIVEN
        VendorMachine vendorMachine = new VendorMachine();

        //WHEN
        VendorMachine.Drink drink = vendorMachine.purchase(100,"coffee");

        //THEN
        assertThat(drink.getName()).isEqualTo("coffee");
    }

}