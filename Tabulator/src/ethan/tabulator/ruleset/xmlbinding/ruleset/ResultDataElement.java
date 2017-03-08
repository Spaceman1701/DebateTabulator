package ethan.tabulator.ruleset.xmlbinding.ruleset;

import java.util.List;

/**
 * Created by Ethan on 3/6/2017.
 */
public class ResultDataElement {
    private List<RoundResultDataElement> roundsResults;

    public ResultDataElement(List<RoundResultDataElement> roundsResults) {
        this.roundsResults = roundsResults;
    }

    public List<RoundResultDataElement> getRoundsResults() {
        return roundsResults;
    }
}
