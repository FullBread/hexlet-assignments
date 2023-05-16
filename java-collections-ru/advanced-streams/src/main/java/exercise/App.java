package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

class App {
    public static String getForwardedVariables(String content) {
        return Arrays.stream(content.split("\n"))
                .filter(x -> x.startsWith("environment"))
                .map(y -> y.replaceAll("environment=", ""))
                .flatMap(str -> Arrays.stream(str.split(",")))
                .map(x -> x.replaceAll("\"", ""))
                .filter(i ->  i.startsWith("X_FORWARDED_"))
                .map(x -> x.replaceAll("X_FORWARDED_", ""))
                .map(x -> x.replaceAll(" ", ""))
                .collect(Collectors.joining(","));
    }
}




