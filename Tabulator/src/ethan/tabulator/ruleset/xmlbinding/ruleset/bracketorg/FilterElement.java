package ethan.tabulator.ruleset.xmlbinding.ruleset.bracketorg;

/**
 * Created by Ethan on 3/6/2017.
 */
public class FilterElement {
    private final String type;
    private final String value;

    public FilterElement(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
