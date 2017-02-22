package ethan.tabulator.round;

import ethan.tabulator.tournament.RoundHistory;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ethan on 2/21/2017.
 */
public class TournamentRound<T extends Round> {
    Set<T> rounds;

    public TournamentRound() {
        rounds = new HashSet<>();
    }

    public TournamentRound(Set<T> rounds) {
        this.rounds = rounds;
    }

    public Set<T> getRounds() {
        return rounds;
    }

    public void addRound(T r) {
        rounds.add(r);
    }
}
