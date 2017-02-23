package ethan.tabulator.ruleset;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import com.sun.org.apache.xml.internal.utils.DefaultErrorHandler;
import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.SourceLocator;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

/**
 * Created by Ethan on 2/23/2017.
 */
public final class XMLUtils {
    private XMLUtils() {}

    public static final String RESOURCE_DIR = "Tabulator" + File.separator + "res" + File.separator;
    public static final String SCHEMA_DIR = RESOURCE_DIR + "schema" + File.separator;

    private static final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
    private static final DocumentBuilderFactory documentBuilderFactor = DocumentBuilderFactory.newInstance();


    public static Document loadXMLDocument(String srcName, String schemaName) throws InvalidXMLException {
        try {
            Schema schema = schemaFactory.newSchema(new File(SCHEMA_DIR + schemaName));
            Validator v = schema.newValidator();

            DocumentBuilder documentBuilder = documentBuilderFactor.newDocumentBuilder();

            Document document = documentBuilder.parse(RESOURCE_DIR + srcName);

            v.validate(new DOMSource(document));

            return document;
        } catch (SAXException e) {
            e.printStackTrace();
            throw new InvalidXMLException("Problem validating file: " + srcName);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            throw new InvalidXMLException("Problem parsing file: " + srcName);
        } catch (IOException e) {
            e.printStackTrace();
            throw new InvalidXMLException("Problem reading file: " + srcName);
        }
    }

}
