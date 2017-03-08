package ethan.jaxb;

import ethan.jaxb.ruleset.Ruleset;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by Ethan on 3/8/2017.
 */
public class XMLHandler {
    private static final String PACKAGE_LOCATION = "ethan.jaxb";
    private static final String RULESET_PACKAGE = PACKAGE_LOCATION + ".ruleset";
    private static final String EVENT_TYPE_PACKAGE = PACKAGE_LOCATION + ".eventtype";
    private static final String COMPETITOR_TYPES = PACKAGE_LOCATION + ".competitortype";


    public static Ruleset loadRuleset(String rulesetLocation) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(RULESET_PACKAGE);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        return (Ruleset)unmarshaller.unmarshal(new File(rulesetLocation));
    }
}
