package ethan.tabulator.ruleset.rule;

import ethan.tabulator.round.DebateRound;

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

    public boolean testExpected(DebateRound round) {
        return rule.testRound(round) == expectedResult;
    }
}
