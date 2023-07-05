package exercise;

import java.util.Map;

public abstract class Tag {
    protected String tagName;
    protected Map<String, String> tagValue;


    public Tag(String tagName, Map<String, String> tagValue) {
        this.tagName = tagName;
        this.tagValue = tagValue;
    }
}
