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
}