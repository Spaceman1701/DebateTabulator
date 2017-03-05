package ethan.tabulator.ruleset;

import ethan.tabulator.round.Round;
import ethan.tabulator.round.TournamentRound;
import ethan.tabulator.tournament.RoundHistory;

import java.util.Map;

/**
 * Created by Ethan on 2/20/2017.
 */
public class Ruleset {
    Map<Integer, PairingGenerator> roundPairingGenerators;
    Map<Integer, PairingGenerator> judgePairingGenerators;



    public TournamentRound generateNextRound(int roundNumber, RoundHistory<Round> roundHistory) {
        return null;
    }
}
