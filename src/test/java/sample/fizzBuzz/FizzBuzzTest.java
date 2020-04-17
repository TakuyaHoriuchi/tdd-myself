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

    }

    @Test
    void fizz3() {
        String actual = fizzBuzz.execute(3);
        assertThat(actual).isEqualTo("Fizz");
    }


}