package sample.arrayStats;

import java.util.List;
import java.util.stream.IntStream;

public class ArrayStats {
    public String execute(List<Integer> input) {
        String numberOfElements = String.valueOf(input.size());
        String minimum = String.valueOf(getIntStream(input).min().getAsInt());
        String average = String.valueOf(getAsDouble(input));
        String maximum = String.valueOf(getIntStream(input).max().getAsInt());

        return
            " o) minimum value = " + minimum + "\n" +
                " o) maximum value = " + maximum + "\n" +
                " o) number of elements in the sequence = " + numberOfElements + "\n" +
                " o) average value = " + average;
    }

    private double getAsDouble(List<Integer> input) {
        double asDouble = getIntStream(input).average().getAsDouble();
        double v = asDouble * 10 * 10 * 10 * 10 * 10 * 10;
        return Math.floor(v)/(10 * 10 * 10 * 10 * 10 * 10);
    }

    private IntStream getIntStream(List<Integer> input) {
        return input.stream().mapToInt(Integer::intValue);
    }
}
