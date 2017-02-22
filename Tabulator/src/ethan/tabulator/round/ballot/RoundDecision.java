package ethan.tabulator.round.ballot;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ethan on 2/21/2017.
 */
public class RoundDecision {
    Set<Ballot> ballots;

    public RoundDecision() {
        ballots = new HashSet<>();
    }

    public void addBallot(Ballot b) {
        ballots.add(b);
    }

    public void addBallots(Collection<Ballot> b) {
        ballots.addAll(b);
    }

    public Set<Ballot> getBallots() {
        return ballots;
    }
}
