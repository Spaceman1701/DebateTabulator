package ethan.tabulator.ruleset.rule;

import ethan.tabulator.round.DebateRound;
import ethan.tabulator.round.Round;
import ethan.tabulator.tournament.RoundHistory;

/**
 * Created by Ethan on 2/21/2017.
 */
public class RuleFunctions {

    @RuleData(name="MEETING_SWITCH_SIDES")
    public class MeetingSwitchSides implements Rule {
        public boolean testRound(Round round, RoundHistory history) {

            return true;
        }
    }

}
