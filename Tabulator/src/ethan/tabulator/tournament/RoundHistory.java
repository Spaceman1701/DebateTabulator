package ethan.tabulator.tournament;

import ethan.tabulator.round.Round;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Ethan on 2/20/2017.
 */
public class RoundHistory<T extends Round> {
    private HashMap<Integer, List<T>> rounds;

    public RoundHistory() {
        rounds = new HashMap<>();
    }


    public List<T> getRounds(int roundNumber) {
        return rounds.get(roundNumber);
    }
}
