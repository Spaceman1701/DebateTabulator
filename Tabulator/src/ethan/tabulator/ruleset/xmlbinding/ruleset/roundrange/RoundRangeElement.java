package ethan.tabulator.ruleset.xmlbinding.ruleset.roundrange;

import java.util.List;

/**
 * Created by Ethan on 3/6/2017.
 */
public class RoundRangeElement {
    private List<RoundElement> rounds;

    public RoundRangeElement(List<RoundElement> rounds) {
        this.rounds = rounds;
    }

    public List<RoundElement> getRounds() {
        return rounds;
    }
}
