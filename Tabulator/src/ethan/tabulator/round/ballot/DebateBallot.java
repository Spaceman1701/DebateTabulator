package ethan.tabulator.round.ballot;

import ethan.tabulator.round.DebateRound;
import ethan.tabulator.round.Team;
import ethan.tabulator.round.person.Competitor;
import ethan.tabulator.round.person.Judge;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ethan on 2/21/2017.
 */
public class DebateBallot extends Ballot{
    private Team winner;

    public DebateBallot(Judge judge, DebateRound round) {
        super(judge, round);
    }


    public void setWinner(Team t) {
        this.winner = t;
    }

    public Team getWinner() {
        return winner;
    }

    @Override
    public boolean isComplete() {
        return winner != null;
    }
}
