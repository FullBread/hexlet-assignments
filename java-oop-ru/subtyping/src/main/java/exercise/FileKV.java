package exercise;

import java.util.HashMap;
import java.util.Map;

public class FileKV implements KeyValueStorage {
    private String filePath;
    private Map<String, String> data;

    public FileKV(String filePath, Map<String, String> data) {
        this.filePath = filePath;
        this.data = data;
        Utils.writeFile(filePath, data.toString());
        Utils.serialize(data);
    }
    public void set(String key, String value) {

        data.put(key, value);
        Utils.writeFile(filePath, data.toString());
    }
    public void unset(String key) {

        data.remove(key);
        Utils.writeFile(filePath, data.toString());
    }
    public String get(String key, String defaultValue) {

        return data.getOrDefault(key, defaultValue);
    }
    public Map<String, String> toMap() {

        return new HashMap<>(data);
    }
}
