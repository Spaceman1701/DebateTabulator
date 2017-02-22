package ethan.tabulator.round.ballot;

import ethan.tabulator.round.Round;
import ethan.tabulator.round.person.Competitor;
import ethan.tabulator.round.person.Judge;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ethan on 2/21/2017.
 */
public abstract class Ballot {
    private Judge judge;
    private Map<Competitor, Integer> speakerPoints;

    public Ballot(Judge judge, Round round) {
        this.judge = judge;
        speakerPoints = new HashMap<>();

        for (Competitor c : round.getCompetitors()) {
            speakerPoints.put(c, 0);
        }
    }

    public int getSpeakerPoints(Competitor c) {
        return speakerPoints.get(c);
    }

    public void setSpeakerPoints(Competitor c, int amount) {
        speakerPoints.replace(c, amount);
    }

    public Judge getJudge() {
        return judge;
    }

    public abstract boolean isComplete();
}
