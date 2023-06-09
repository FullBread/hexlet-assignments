package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class AppTest {
    @Test
    public void testTake() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected1 = Arrays.asList(1, 2, 3);
        List<Integer> expected2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual1 = App.take(input, 3);
        List<Integer> actual2 = App.take(input, 8);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void testEmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = App.take(input, 3);
        assertEquals(expected, actual);
    }
    }
//    List<Integer> numbers;
//    @BeforeEach
//    void initIntegerList() {
//        this.numbers = new ArrayList<>();
//        this.numbers.add(25);
//        this.numbers.add(35);
//        this.numbers.add(15);
//        this.numbers.add(124);
//    }
//    @Test
//    void testTake() {
//        List<Integer> q1 = new ArrayList(Arrays.asList(1, 2, 3, 4));
//        var actual1 = App.take(q1, 2);
//        List<Integer> answer1 = new ArrayList(Arrays.asList(1, 2));
//        assertThat(actual1).isEqualTo(answer1);
//
//        List<Integer> q2 = new ArrayList(Arrays.asList(7, 3, 10));
//        var actual2 = App.take(q2, 8);
//        List<Integer> answer2 = new ArrayList(Arrays.asList(7, 3, 10));
//        assertThat(actual2).isEqualTo(answer2);

//        var actual = App.take(numbers, 0);
//        List<Integer> answer = new ArrayList(Arrays.asList());
//        assertThat(actual).isEqualTo(answer);