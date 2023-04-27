package exercise;

import java.util.HashMap;
import java.util.Map;
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = sentence.split(" ");
        if (sentence.length() == 0) {
            return map;
        }
        for (var i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }
        return map;
    }

    public static String toString(Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        if (map.isEmpty()) {
            return "{}";
        } else {
            sb.append("{\n");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                sb.append("  ").append(entry.getKey()).append(":"
                        + " ").append(entry.getValue()).append("\n");
            }
            sb.append("}");
            return sb.toString();
        }
    }
}
