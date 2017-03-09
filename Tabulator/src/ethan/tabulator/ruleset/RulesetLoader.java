package ethan.tabulator.ruleset;

import ethan.jaxb.XMLHandler;
import ethan.jaxb.ruleset.*;
import ethan.tabulator.ruleset.method.*;
import ethan.tabulator.ruleset.method.Method;
import ethan.tabulator.ruleset.rule.RuleResultPair;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ethan on 2/21/2017.
 */
public class RulesetLoader {

    private static final String RULSET_SCHEMA = "ruleset.xsd";

    public static Ruleset loadRuleset(String location) throws JAXBException {
        RulesetRoot root = XMLHandler.loadRuleset(XMLUtils.RESOURCE_DIR + location);

        String rulesetName = root.getName();
        String rulsetTarget = root.getApplication();


        List<PairingGenerator> roundAssigners = new ArrayList<>();
        for (RulesetRoot.RoundPairing roundPairing : root.getRoundPairing()) {
            roundAssigners.add(buildPairingGenerator(roundPairing));
        }
    }

    private static PairingGenerator buildPairingGenerator(RulesetRoot.RoundPairing pairing) {
        PairingGenerator.PairingGeneratorBuilder pairingGeneratorBuilder =
                new PairingGenerator.PairingGeneratorBuilder(pairing.isRequiresResultHistory());

        for (RoundRange.Round round : pairing.getRoundRange().getRound()) {
            pairingGeneratorBuilder.addRound(round.getName().intValue());
        }

        if (pairing.isRequiresResultHistory()) {
            for (RulesetRoot.RoundPairing.ResultData.RoundResult roundResult: pairing.getResultData().getRoundResult()) {
                pairingGeneratorBuilder.addRequiredRound(roundResult.getName().intValue());
            }
        }

        for (ethan.jaxb.ruleset.Method method : pairing.getMethod()) {
            pairingGeneratorBuilder.addMethod(buildMethod(method));
        }

        return pairingGeneratorBuilder.build();
    }

    private static Method buildMethod(ethan.jaxb.ruleset.Method methodElement) {
        Method.Type type = Method.Type.fromString(methodElement.getType());
        Method.MethodBuilder methodBuilder =
                new Method.MethodBuilder(type, methodElement.getName(), methodElement.getPriority().intValue());

        for (Rule r : methodElement.getRule()) {
            methodBuilder.addRule(buildRule(r));
        }

        return methodBuilder.build();
    }

    private static RuleResultPair buildRule(Rule r) {

    }

    /**
     * just here to experiment a bit
     * @param args
     */
    public static void main(String[] args) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
