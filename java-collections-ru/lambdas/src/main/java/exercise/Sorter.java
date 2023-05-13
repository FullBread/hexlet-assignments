package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> user) {
        List oldestMan = user.stream()
                .filter(men -> men.get("gender").equals("male"))
                .sorted(Comparator.comparing(maleUser -> maleUser.get("birthday")))
                .map(map -> map.get("name"))
                .collect(Collectors.toList());
        return oldestMan;
    }
}

