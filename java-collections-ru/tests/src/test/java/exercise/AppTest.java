package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
//    List<Integer> numbers;
//    @BeforeEach
//    void initIntegerList() {
//        this.numbers = new ArrayList<>();
//        this.numbers.add(25);
//        this.numbers.add(35);
//        this.numbers.add(15);
//        this.numbers.add(124);
//    }
    @Test
    void testTake() {
        List<Integer> q1 = new ArrayList(Arrays.asList(1, 2, 3, 4));
        var actual1 = App.take(q1, 2);
        List<Integer> answer1 = new ArrayList(Arrays.asList(1, 2));
        assertThat(actual1).isEqualTo(answer1);

        List<Integer> q2 = new ArrayList(Arrays.asList(7, 3, 10));
        var actual2 = App.take(q2, 8);
        List<Integer> answer2 = new ArrayList(Arrays.asList(7, 3, 10));
        assertThat(actual2).isEqualTo(answer2);

//        var actual = App.take(numbers, 0);
//        List<Integer> answer = new ArrayList(Arrays.asList());
//        assertThat(actual).isEqualTo(answer);
    }
}
