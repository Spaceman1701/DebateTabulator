package ethan.tabulator.ruleset.xmlbinding.ruleset.method;

import ethan.tabulator.ruleset.xmlbinding.ruleset.RulesetElement;

/**
 * Created by Ethan on 3/6/2017.
 */
public class RuleElement {
    private final String operation;
    private final boolean value;
    private final int priority;

    public RuleElement(String operation, boolean value, int priority) {
        this.operation = operation;
        this.value = value;
        this.priority = priority;
    }

    public String getOperation() {
        return operation;
    }

    public boolean getValue() {
        return value;
    }

    public final int getPriority() {
        return priority;
    }
}
