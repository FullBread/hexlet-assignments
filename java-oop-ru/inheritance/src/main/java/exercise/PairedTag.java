package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class PairedTag extends Tag {
    private String tagBody;
    private List<Tag> child;

    public PairedTag(String tagName, Map<String, String> tagValue, String tagBody, List<Tag> child) {
        super(tagName, tagValue);
        this.tagBody = tagBody;
        this.child = child;
    }
    public String toString() {
        String strChild = child.stream()
                .map(singleTag -> singleTag.toString())
                .collect(Collectors.joining());
        String attributeFinal = tagValue.entrySet()
                .stream()
                .map(attribute -> " " + attribute.getKey() + "=\"" + attribute.getValue() + "\"")
                .collect(Collectors.joining());
        String result = "<" + tagName + attributeFinal + ">" + strChild + tagBody + "</" + tagName + ">";
        return result;
    }
}
