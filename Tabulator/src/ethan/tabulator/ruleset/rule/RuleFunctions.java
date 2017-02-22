package ethan.tabulator.ruleset.rule;

import ethan.tabulator.round.DebateRound;
import ethan.tabulator.round.Round;
import ethan.tabulator.round.TournamentRound;
import ethan.tabulator.tournament.RoundHistory;
import ethan.tabulator.tournament.Tournament;

import java.util.List;
import java.util.Set;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by Ethan on 2/21/2017.
 */
public class RuleFunctions {

    @RuleData(name = "MEETING_SWITCH_SIDES", target = RuleData.SIDED_DEBATE_T)
    public class MeetingSwitchSides<T extends Round> implements Rule<T> {
        @Override
        public boolean testRound(T round, RoundHistory<T> history) {
            List<TournamentRound<T>> rounds = history.getAllRounds();

            if (rounds.size() > 0) {
                TournamentRound<T> lastRounds = rounds.get(rounds.size() - 1); //last round

                for (T oldRound : lastRounds.getRounds()) {
                    if (oldRound.getTeams().containsAll(round.getTeams())) {
                        DebateRound newDebateRound = (DebateRound)round;
                        DebateRound lastDebateRound = (DebateRound) oldRound;

                        if (newDebateRound.getAff().equals(newDebateRound.getAff())) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

}
