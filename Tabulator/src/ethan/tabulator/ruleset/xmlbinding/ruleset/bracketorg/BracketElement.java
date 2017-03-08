package ethan.tabulator.ruleset.xmlbinding.ruleset.bracketorg;

import java.util.List;

/**
 * Created by Ethan on 3/6/2017.
 */
public class BracketElement {
    private final int level;
    private final String name;
    private final List<FilterElement> filters;

    public BracketElement(int level, String name, List<FilterElement> filters) {
        this.level = level;
        this.name = name;
        this.filters = filters;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public List<FilterElement> getFilters() {
        return filters;
    }
}
