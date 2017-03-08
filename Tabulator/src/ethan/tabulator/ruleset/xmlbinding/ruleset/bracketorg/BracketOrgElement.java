package ethan.tabulator.ruleset.xmlbinding.ruleset.bracketorg;

import java.util.List;

/**
 * Created by Ethan on 3/6/2017.
 */
public class BracketOrgElement {
    private final String method;
    private final OddRuleElement oddRule;
    private List<BracketElement> brackets;
    private final BracketGeneratorElement generator;

    public BracketOrgElement(String method, OddRuleElement oddRule, List<BracketElement> brackets) {
        this.method = method;
        this.oddRule = oddRule;
        this.brackets = brackets;
        generator = null;
    }

    public BracketOrgElement(String method, OddRuleElement oddRule, BracketGeneratorElement bg) {
        this.method = method;
        this.oddRule = oddRule;
        this.brackets = null;
        generator = bg;
    }

    public boolean useGenerator() {
        return brackets == null;
    }

    public String getMethod() {
        return method;
    }

    public OddRuleElement getOddRule() {
        return oddRule;
    }

    public List<BracketElement> getBrackets() {
        return brackets;
    }

    public BracketGeneratorElement getGenerator() {
        return generator;
    }
}
