package sample.fizzBuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void fizz3() {
        String actual = fizzBuzz.execute(3);
        assertThat(actual).isEqualTo("Fizz");
    }


}