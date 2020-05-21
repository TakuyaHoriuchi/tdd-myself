package sample.vendingMachine;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;



class VendingMachineTest {

    //投入金額の総計を取得できる。
    @Test
    void test() {
        VendingMachine vm = new VendingMachine();
        assertThat(vm.getTotal()).isEqualTo(0);
    }
    
    @Test
    void insertMoney(){
        VendingMachine vm = new VendingMachine();

        vm.insertCoin(YEN.TEN);
        assertThat(vm.getTotal()).isEqualTo(10);

        vm.insertCoin(YEN.FIFTY);
        assertThat(vm.getTotal()).isEqualTo(60);

        vm.insertCoin(YEN.HUNDRED);
        assertThat(vm.getTotal()).isEqualTo(160);

        vm.insertCoin(YEN.FIVE_HUNDRED);
        assertThat(vm.getTotal()).isEqualTo(660);

        vm.insertCoin(YEN.THOUSAND);
        assertThat(vm.getTotal()).isEqualTo(1660);
    }

    @Test
    void insert110YenAndRetrunMoney(){
        VendingMachine vm = new VendingMachine();
        vm.insertCoin(YEN.TEN);
        vm.insertCoin(YEN.HUNDRED);
        assertThat(vm.getTotal()).isEqualTo(110);
        
        assertThat(vm.returnMoney()).isEqualTo(110);
        assertThat(vm.getTotal()).isEqualTo(0);
    }
    
    @ParameterizedTest
    @MethodSource("insertCoinArgs")
    void insertCoin(YEN yen, YEN expect) {
        VendingMachine vm = new VendingMachine();
        YEN actual = vm.insertCoin(yen);
        assertThat(actual).isEqualTo(expect);
        assertThat(vm.getTotal()).isEqualTo(0);
    }
    
    private static Stream<Arguments> insertCoinArgs() {
        return Stream.of(
            Arguments.arguments(YEN.ONE, YEN.ONE),
            Arguments.arguments(YEN.FIVE, YEN.FIVE),
            Arguments.arguments(YEN.FIVE_THOUSAND, YEN.FIVE_THOUSAND)
        );
    }

    @Test
    void testInitialJuicesSize(){
        VendingMachine vm = new VendingMachine();
        assertThat(vm.getJuice().size()).isEqualTo(5);
    }
    
    @Test
    void insertJuice(){
        VendingMachine vm = new VendingMachine();
        Juice coke = new Juice("Coke",120);
        vm.insertJuice(coke);
        
        assertThat(vm.getJuice().get(5)).isEqualTo(coke);
    }
}