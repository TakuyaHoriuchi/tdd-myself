package sample.fizzBuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FizzBuzzTests {
    @Test
    void normal() {
        FizzBuzz target = new FizzBuzz();
        String actual = target.execute(2);
        assertThat(actual).isEqualTo("2");
    }

    @Test
    void case3() {
        FizzBuzz target = new FizzBuzz();
        String actual = target.execute(3);
        assertThat(actual).isEqualTo("Fizz");
    }

    @Test
    void case5() {
        FizzBuzz target = new FizzBuzz();
        String actual = target.execute(5);
        assertThat(actual).isEqualTo("Buzz");
    }

    @Test
    void case15() {
        FizzBuzz target = new FizzBuzz();
        String actual = target.execute(15);
        assertThat(actual).isEqualTo("FizzBuzz");
    }
}