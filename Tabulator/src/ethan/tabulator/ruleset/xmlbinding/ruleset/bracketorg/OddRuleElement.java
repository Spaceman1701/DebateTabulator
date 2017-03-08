package ethan.tabulator.ruleset.xmlbinding.ruleset.bracketorg;

import ethan.tabulator.ruleset.xmlbinding.ruleset.pairingmethod.RuleElement;

import java.util.List;

/**
 * Created by Ethan on 3/6/2017.
 */
public class OddRuleElement {
    private final List<RuleElement> rules;

    public OddRuleElement(List<RuleElement> rules) {
        this.rules = rules;
    }

    public List<RuleElement> getRules() {
        return rules;
    }
}
