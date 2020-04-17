package sample.fizzBuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void test2() {
        String actual = fizzBuzz.execute(2);
        assertThat(actual).isEqualTo("2");
    }

    @Test
    void test1() {
        String actual = fizzBuzz.execute(1);
        assertThat(actual).isEqualTo("1");
    }

    @Test
    void test6() {
        String actual = fizzBuzz.execute(6);
        assertThat(actual).isEqualTo("Fizz");
    }

    @Test
    void fizz3() {
        String actual = fizzBuzz.execute(3);
        assertThat(actual).isEqualTo("Fizz");
    }


}