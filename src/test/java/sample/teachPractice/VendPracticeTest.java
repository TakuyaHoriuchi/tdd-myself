package sample.teachPractice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class VendPracticeTest {


    @Test
    void test() {
        assertThat(1).isEqualTo(1);
    }

    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @Nested
    class InsertAndReturnCoin {

        @ParameterizedTest
        @MethodSource("insertCoinArgs")
        void insertCoin(YEN yen, YEN expect) {
            VendPractice target = new VendPractice();
            YEN actual = target.insertMoney(yen);
            assertThat(actual).isEqualTo(expect);
        }

        @Test
        void multiInsertCoinAndRefund(){
            VendPractice target = new VendPractice();
            target.insertMoney(YEN.FIFTY);
            target.insertMoney(YEN.TEN);
            int multiInsertActual = target.viewDisplay();
            assertThat(multiInsertActual).isEqualTo(60);

            int refundActual = target.refund();
            assertThat(refundActual).isEqualTo(60);
            assertThat(target.viewDisplay()).isEqualTo(0);
        }




        private Stream<Arguments> insertCoinArgs() {
            return Stream.of(
                Arguments.arguments(YEN.TEN,null),
                Arguments.arguments(YEN.FIFTY, null),
                Arguments.arguments(YEN.HUNDRED, null),
                Arguments.arguments(YEN.FIVE_HUNDRED, null),
                Arguments.arguments(YEN.THOUSAND, null),
                Arguments.arguments(YEN.ONE, YEN.ONE),
                Arguments.arguments(YEN.FIVE, YEN.FIVE),
                Arguments.arguments(YEN.FIVE_THOUSAND, YEN.FIVE_THOUSAND),
                Arguments.arguments(YEN.TEN_THOUSAND, YEN.TEN_THOUSAND),
                Arguments.arguments(YEN.TWO_THOUSAND, YEN.TWO_THOUSAND)
            );
        }
    }



}