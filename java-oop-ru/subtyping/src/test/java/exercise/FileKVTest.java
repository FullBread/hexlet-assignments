package exercise;

import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
// BEGIN

// END


class FileKVTest {

    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();
    private FileKV fileKV;

    @BeforeEach
    public void beforeEach() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(new HashMap<String, String>());
        Files.writeString(filepath, content, StandardOpenOption.CREATE);
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", "value2");
        fileKV = new FileKV("test.txt", data);
    }
    @Test
    public void testSet() {
        fileKV.set("key3", "value3");
        Map<String, String> expected = new HashMap<>();
        expected.put("key1", "value1");
        expected.put("key2", "value2");
        expected.put("key3", "value3");
        Assertions.assertEquals(expected, fileKV.toMap());
    }
    @Test
    public void testUnset() {
        fileKV.unset("key1");
        Map<String, String> expected = new HashMap<>();
        expected.put("key2", "value2");
        Assertions.assertEquals(expected, fileKV.toMap());
    }
    @Test
    public void testGetOrDefault() {
        String value = fileKV.get("key3", "default");
        Assertions.assertEquals("default", value);
    }
    @Test
    public void testToMap() {
        Map<String, String> expected = new HashMap<>();
        expected.put("key1", "value1");
        expected.put("key2", "value2");
        Assertions.assertEquals(expected, fileKV.toMap());
    }

}
