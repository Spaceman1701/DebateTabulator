package ethan.tabulator.round;

import ethan.tabulator.round.ballot.DebateBallot;
import ethan.tabulator.round.person.Competitor;
import ethan.tabulator.round.person.Judge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Ethan on 2/20/2017.
 */
public class DebateRound extends Round{
    private Team aff;
    private Team neg;


    public DebateRound(Team teamOne, Team teamTwo) {
        this.aff = teamOne;
        this.neg = teamTwo;
    }


    public List<DebateBallot> generateBallots(List<Judge> jugdes) {
        this.judges = jugdes;
        List<DebateBallot> ballots = new ArrayList<>();
        for (Judge j : judges) {
            ballots.add(new DebateBallot(j, this));
        }
        return ballots;
    }

    public Set<Competitor> getCompetitors() {
        Set<Competitor> competitors = new HashSet<>();
        competitors.addAll(aff.getCompetitors());
        competitors.addAll(neg.getCompetitors());
        return competitors;
    }

    @Override
    public Set<Team> getTeams() {
        Set<Team> teams = new HashSet<>();
        teams.add(aff);
        teams.add(neg);
        return teams;
    }

    public Side getTeamSide(Team t) {
        if (t.equals(aff)) {
            return Side.AFF;
        } else if (t.equals(neg)) {
            return Side.NEG;
        }
        return null;
    }

    public Team getAff() {
        return aff;
    }

    public Team getNeg() {
        return neg;
    }
}
