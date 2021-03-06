package ethan.tabulator.ruleset.rule;

import ethan.tabulator.round.DebateRound;
import ethan.tabulator.round.Round;
import ethan.tabulator.tournament.RoundHistory;

/**
 * Created by Ethan on 2/21/2017.
 */
public class RuleResultPair {
    private final Rule rule;
    private final boolean expectedResult;

    public RuleResultPair(Rule rule, boolean expectedResult) {
        this.rule = rule;
        this.expectedResult = expectedResult;
    }

    public Rule getRule() {
        return rule;
    }

    public boolean getExpectedResult() {
        return expectedResult;
    }

    public boolean testExpected(Round round, RoundHistory history) {
        return rule.testRound(round, history) == expectedResult;
    }
}
