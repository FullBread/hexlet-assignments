package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> search) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : books) {
            boolean match = true;
            for (String key : search.keySet()) {
                if (book.containsKey(key) && book.get(key).equals(search.get(key))) {
                    match = true;
                } else {
                    match = false;
                    break;
                }
            }
            if (match) {
                result.add(book);
            }
        }
        return result;
    }
}
