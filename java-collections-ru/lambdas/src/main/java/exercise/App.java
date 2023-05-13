package exercise;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class App {
    public static String[][] enlargeArrayImage(String[][] array) {
        return Arrays.stream(array)
                .flatMap(x -> Stream.of(x, x))
                .map(y -> stream(y)
                .flatMap(i -> Stream.of(i, i))
                .toArray(String[]::new))
                .toArray(String[][]::new);
    }
}

