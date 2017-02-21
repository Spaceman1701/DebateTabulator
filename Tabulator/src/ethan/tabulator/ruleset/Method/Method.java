package ethan.tabulator.ruleset.Method;

import ethan.tabulator.ruleset.rule.RuleResultPair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ethan on 2/21/2017.
 */
public abstract class Method {
    public enum Type {
        GIVE_BYE, DO_PAIRING
    }

    private final Type type;
    private final String name;
    private final int priority;

    protected List<RuleResultPair> rules;


    public Method(Type type, String name, int priority) {
        this.type = type;
        this.name = name;
        this.priority = priority;

        rules = new ArrayList<>();
    }


    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
}
