package sample.arrayStats;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ArrayStataTests {

    @Test
    void name() {

        List<Integer> testCase = Arrays.asList(1);
        ArrayStats target = new ArrayStats();
        String actual = target.execute(testCase);

        String expect =
            " o) minimum value = 1\n" +
                " o) maximum value = 1\n" +
                " o) number of elements in the sequence = 1\n" +
                " o) average value = 1.0";
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    void singleList2() {

        List<Integer> testCase = Arrays.asList(2);
        ArrayStats target = new ArrayStats();
        String actual = target.execute(testCase);

        String expect =
            " o) minimum value = 2\n" +
                " o) maximum value = 2\n" +
                " o) number of elements in the sequence = 1\n" +
                " o) average value = 2.0";
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    void next() {
        List<Integer> testCase = Arrays.asList(1,1);
        ArrayStats target = new ArrayStats();
        String actual = target.execute(testCase);

        String expect =
            " o) minimum value = 1\n" +
                " o) maximum value = 1\n" +
                " o) number of elements in the sequence = 2\n" +
                " o) average value = 1.0";
        assertThat(actual).isEqualTo(expect);

    }

    @Test
    void minimum() {
        List<Integer> testCase = Arrays.asList(-1,1);
        ArrayStats target = new ArrayStats();
        String actual = target.execute(testCase);

        String expect =
            " o) minimum value = -1\n" +
                " o) maximum value = 1\n" +
                " o) number of elements in the sequence = 2\n" +
                " o) average value = 0.0";
        assertThat(actual).isEqualTo(expect);

    }

    @Test
    void triple() {
        List<Integer> testCase = Arrays.asList(1,1,2);
        ArrayStats target = new ArrayStats();
        String actual = target.execute(testCase);

        String expect =
            " o) minimum value = 1\n" +
                " o) maximum value = 2\n" +
                " o) number of elements in the sequence = 3\n" +
                " o) average value = 1.333333";
        assertThat(actual).isEqualTo(expect);

    }

}