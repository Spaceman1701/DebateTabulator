package ethan.tabulator.ruleset.xmlbinding.ruleset;

import ethan.tabulator.ruleset.xmlbinding.ruleset.method.MethodElement;
import ethan.tabulator.ruleset.xmlbinding.ruleset.roundrange.RoundRangeElement;

import java.util.List;

/**
 * Created by Ethan on 3/6/2017.
 */
public class RoundPairingElement {
    private RoundRangeElement roundRange;
    private List<MethodElement> methods;

    public RoundPairingElement(RoundRangeElement roundRange, List<MethodElement> methods) {
        this.methods = methods;
        this.roundRange = roundRange;
    }

    public RoundRangeElement getRoundRange() {
        return roundRange;
    }

    public List<MethodElement> getMethods() {
        return methods;
    }
}
