package ethan.tabulator.ruleset;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Ethan on 2/21/2017.
 */
public class RulesetLoader {



    public RulesetLoader(String competitorTypesLocation, String eventTypesLocation, String rulesetLocation) {
        loadCompeitorTypes(competitorTypesLocation);
        loadEventTypes(eventTypesLocation);

        loadRuleset(rulesetLocation);
    }

    private void loadCompeitorTypes(String location) {

    }

    private void loadEventTypes(String location) {

    }

    private void loadRuleset(String location) {
        String schemaFile = "ruleset.xsd";
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try {
            Schema schema = schemaFactory.newSchema(new File(schemaFile));
            Validator validator = schema.newValidator();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
