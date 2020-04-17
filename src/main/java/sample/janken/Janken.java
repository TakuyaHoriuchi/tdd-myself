package sample.janken;

public class Janken {
    private static final String SCISSORS = "scissors";
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";

    public String play(String player1Hand, String player2Hand) {
        if (
            (player1Hand.equals(SCISSORS) && player2Hand.equals(ROCK)) ||
            (player1Hand.equals(PAPER) && player2Hand.equals(SCISSORS)) ||
            (player1Hand.equals(ROCK) && player2Hand.equals(PAPER))
        ) {
            return "player 2 wins.";
        }

        return "player 1 wins.";
    }
}
