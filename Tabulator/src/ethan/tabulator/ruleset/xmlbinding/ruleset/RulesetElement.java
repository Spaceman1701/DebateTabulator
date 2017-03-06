package ethan.tabulator.ruleset.xmlbinding.ruleset;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ethan on 3/6/2017.
 */
public class RulesetElement {
    private final String name;
    private final String application;
    private List<RoundPairingElement> roundPairings;
    private List<JudgePairingElement> judgePairings;

    public RulesetElement(String name, String application) {
        this.name = name;
        this.application = application;

        roundPairings = new ArrayList<>();
        judgePairings = new ArrayList<>();
    }

    public void addRoundPairing(RoundPairingElement rp) {
        roundPairings.add(rp);
    }

    public void addJudgePairing(JudgePairingElement jp) {
        judgePairings.add(jp)  ;
    }

    public List<RoundPairingElement> getRoundPairings() {
        return roundPairings;
    }

    public List<JudgePairingElement> getJudgePairings() {
        return judgePairings;
    }

    public String getName() {
        return name;
    }

    public String getApplication() {
        return application;
    }
}
