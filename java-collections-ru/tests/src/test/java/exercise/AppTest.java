package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    List<Integer> numbers;
    @BeforeEach
    void initIntegerList() {
        this.numbers = new ArrayList<>();
        this.numbers.add(25);
        this.numbers.add(35);
        this.numbers.add(15);
        this.numbers.add(124);
    }
    @Test
    void testTake() {
        var actual1 = App.take(numbers, 2);
        List<Integer> answer1 = new ArrayList(Arrays.asList(25, 35));
        assertThat(actual1).isEqualTo(answer1);

        var actual2 = App.take(numbers, 4);
        List<Integer> answer2 = new ArrayList(Arrays.asList(25, 35, 15, 124));
        assertThat(actual2).isEqualTo(answer2);

        var actual = App.take(numbers, 0);
        List<Integer> answer = new ArrayList(Arrays.asList());
        assertThat(actual).isEqualTo(answer);
    }
}
