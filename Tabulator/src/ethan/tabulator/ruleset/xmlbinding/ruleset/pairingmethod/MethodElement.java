package ethan.tabulator.ruleset.xmlbinding.ruleset.pairingmethod;

import ethan.tabulator.ruleset.xmlbinding.ruleset.RulesetElement;

import java.util.List;

/**
 * Created by Ethan on 3/6/2017.
 */
public class MethodElement {
    private List<RulesetElement> rules;

    public MethodElement(List<RulesetElement> rules) {
        this.rules = rules;
    }

    public List<RulesetElement> getRules() {
        return rules;
    }
}
