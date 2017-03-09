package ethan.tabulator.ruleset.method;

import ethan.tabulator.ruleset.rule.RuleResultPair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ethan on 2/21/2017.
 */
public class Method {
    public enum Type {
        GIVE_BYE, DO_PAIRING;

        public static Type fromString(String type) {
            switch (type.toUpperCase()) {
                case "GIVE_BYE":
                    return GIVE_BYE;
                case "DO_PAIRING":
                    return DO_PAIRING;
            }
            return null;
        }
    }

    private final Type type;
    private final String name;
    private final int priority;

    private final List<RuleResultPair> rules;


    private Method(Type type, String name, int priority) {
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

    public static class MethodBuilder {
        private final Type type;
        private final String name;
        private final int priority;

        private List<RuleResultPair> rules;

        public MethodBuilder(Type type, String name, int priority) {
            this.type = type;
            this.name = name;
            this.priority = priority;
        }

        public void addRule(RuleResultPair rule) {
            rules.add(rule);
        }

        public Method build() {
            return new Method(type, name, priority);
        }
    }
}
