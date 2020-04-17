package sample.janken;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class JankenTest {

    @ParameterizedTest
    @CsvSource({
        "rock, scissors",
        "scissors, paper",
        "paper, rock"
    })
    void player1Wins(String player1Hand, String player2Hand) {
        Janken janken = new Janken();

        String result = janken.play(player1Hand, player2Hand);

        assertThat(result).isEqualTo("player 1 wins.");
    }

    @ParameterizedTest
    @CsvSource({
        "scissors, rock",
        "paper, scissors",
        "rock, paper"
    })
    void player2Wins(String player1Hand, String player2Hand) {
        Janken janken = new Janken();

        String result = janken.play(player1Hand, player2Hand);

        assertThat(result).isEqualTo("player 2 wins.");
    }
}
