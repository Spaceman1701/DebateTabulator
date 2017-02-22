package ethan.tabulator.tournament;

import ethan.tabulator.round.Round;
import ethan.tabulator.round.Team;
import ethan.tabulator.round.TournamentRound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by Ethan on 2/20/2017.
 */
public class RoundHistory<T extends Round> {
    private List<TournamentRound<T>> rounds;

    public RoundHistory() {
        rounds = new ArrayList<>();
    }

    public TournamentRound getFullRound(int number) {
        return rounds.get(number);
    }

    public void addRound(TournamentRound<T> tr) {
        rounds.add(tr);
    }

    public List<TournamentRound<T>> getAllRounds() {
        return rounds;
    }

    public List<T> getTeamHistory(Team t) {
        List<T> teamHistory = new ArrayList<>();
        for (TournamentRound<T> tournamentRounds : rounds) {
            for (T round : tournamentRounds.getRounds()) {
                if (round.getCompetitors().contains(t)) {
                    teamHistory.add(round);
                }
            }
        }
        return teamHistory;
    }
}
