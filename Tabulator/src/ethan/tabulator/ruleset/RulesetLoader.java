package ethan.tabulator.ruleset;

import ethan.jaxb.XMLHandler;
import ethan.jaxb.ruleset.*;

/**
 * Created by Ethan on 2/21/2017.
 */
public class RulesetLoader {

    private static final String RULSET_SCHEMA = "ruleset.xsd";

    public RulesetLoader(String competitorTypesLocation, String eventTypesLocation, String rulesetLocation) throws Exception {
        loadCompeitorTypes(competitorTypesLocation);
        loadEventTypes(eventTypesLocation);

        loadRuleset(rulesetLocation);
    }

    private void loadCompeitorTypes(String location) {

    }

    private void loadEventTypes(String location) {

    }

    private void loadRuleset(String location) throws Exception {
        ethan.jaxb.ruleset.Ruleset rs = XMLHandler.loadRuleset(XMLUtils.RESOURCE_DIR + location);
        System.out.println(rs.getName());
        RoundRange rr = rs.getRoundPairing().get(0).getRoundRange();
        System.out.println(rr.getRound().get(0).getName());
    }

    /**
     * just here to experiment a bit
     * @param args
     */
    public static void main(String[] args) {
        try {
            RulesetLoader rl = new RulesetLoader(null, null, "CHSSA_REGIONAL_QUAL_RULESET.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
