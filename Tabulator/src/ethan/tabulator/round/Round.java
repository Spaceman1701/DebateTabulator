package ethan.tabulator.round;

import ethan.tabulator.round.ballot.RoundDecision;
import ethan.tabulator.round.person.Competitor;
import ethan.tabulator.round.person.Judge;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Ethan on 2/20/2017.
 */
public abstract class Round {
    protected List<Judge> judges;
    private RoundDecision decision;

    public Round() {
        judges = new ArrayList<>();
    }

    public void addDecision(RoundDecision d) {
        this.decision = d;
    }

    public RoundDecision getDecision() {
        return decision;
    }

    public boolean isDecided() {
        return decision != null;
    }

    public abstract Set<Competitor> getCompetitors();
    public abstract Set<Team> getTeams();

}
