package ethan.tabulator.ruleset.rule;

import ethan.tabulator.round.DebateRound;
import ethan.tabulator.round.Round;
import ethan.tabulator.tournament.RoundHistory;
import ethan.tabulator.tournament.Tournament;

/**
 * Created by Ethan on 2/21/2017.
 */
public interface Rule<T extends Round> {
    boolean testRound(T round, RoundHistory<T> history);
}
