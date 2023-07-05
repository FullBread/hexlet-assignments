package exercise;

import java.util.Map;
import java.util.stream.Collectors;

public class SingleTag extends Tag {
    public SingleTag(String tagName, Map<String, String> tagValue) {
        super(tagName, tagValue);
    }
    public String toString() {
        String attributeFinal = tagValue.entrySet()
                .stream()
                .map(attribute -> " " + attribute.getKey() + "=\"" + attribute.getValue() + "\"")
                .collect(Collectors.joining());
        String result = "<" + tagName + attributeFinal + ">";
        return result;
    }
}
