package ethan.tabulator.ruleset.xmlbinding.ruleset;

import ethan.tabulator.ruleset.xmlbinding.ruleset.pairingmethod.MethodElement;
import ethan.tabulator.ruleset.xmlbinding.ruleset.roundrange.RoundRangeElement;

/**
 * Created by Ethan on 3/6/2017.
 */
public class JudgePairingElement {
    private final RoundRangeElement roundRange;
    private final MethodElement method;

    public JudgePairingElement(RoundRangeElement roundRange, MethodElement method) {
        this.roundRange = roundRange;
        this.method = method;
    }

    public RoundRangeElement getRoundRange() {
        return roundRange;
    }

    public MethodElement getMethod() {
        return method;
    }
}
