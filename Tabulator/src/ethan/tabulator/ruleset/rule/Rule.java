package ethan.tabulator.ruleset.rule;

import ethan.tabulator.round.DebateRound;

/**
 * Created by Ethan on 2/21/2017.
 */
public interface Rule {
    boolean testRound(DebateRound round);
}
