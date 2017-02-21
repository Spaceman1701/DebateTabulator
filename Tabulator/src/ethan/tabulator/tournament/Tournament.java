package ethan.tabulator.tournament;

import ethan.tabulator.round.Round;
import ethan.tabulator.round.Team;
import ethan.tabulator.round.person.Judge;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ethan on 2/20/2017.
 */
public class Tournament<T extends Round> {
    Set<Team> teams;
    Set<Judge> judges;
    RoundHistory<T> history;

    private int numberRoundsRun;

    private int numebrRoundsPaired;

    public Tournament() {
        teams = new HashSet<>();
        judges = new HashSet<>();
        history = new RoundHistory<>();
    }


    public void registerJudge(Judge j) {
        judges.add(j);
    }

    public void registerTeam(Team t) {
        teams.add(t);
    }
}
