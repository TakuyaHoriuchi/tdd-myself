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
    void fizz6() {
        String actual = fizzBuzz.execute(6);
        assertThat(actual).isEqualTo("Fizz");
    }

    @Test
    void fizz3() {
        String actual = fizzBuzz.execute(3);
        assertThat(actual).isEqualTo("Fizz");
    }

    @Test
    void buzz5() {
        String actual = fizzBuzz.execute(5);
        assertThat(actual).isEqualTo("Buzz");
    }

    @Test
    void buzz10() {
        String actual = fizzBuzz.execute(10);
        assertThat(actual).isEqualTo("Buzz");
    }

}