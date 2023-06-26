package exercise;

import java.util.Map;
import java.util.HashMap;

public class InMemoryKV implements KeyValueStorage {
    private final Map<String, String> database;


    public InMemoryKV(Map<String, String> initialData) {
        this.database = new HashMap<>(initialData);
    }

    public void set(String key, String value) {

        database.put(key, value);
    }

    public void unset(String key) {

        database.remove(key);
    }

    public String get(String key, String defaultValue) {

        return database.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(database);
    }

}
