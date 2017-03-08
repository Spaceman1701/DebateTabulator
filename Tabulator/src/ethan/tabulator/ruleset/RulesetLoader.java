package ethan.tabulator.ruleset;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import ethan.jaxb.XMLHandler;
import ethan.jaxb.ruleset.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;

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
