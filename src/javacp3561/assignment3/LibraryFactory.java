package javacp3561.assignment3;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * LibraryFactory class.
 * Takes path to XML doc and parses it into the relevant objects.
 */
public class LibraryFactory {
    DocumentBuilderFactory factory;
    DocumentBuilder builder;

    public LibraryFactory(String pathname) {
        factory = DocumentBuilderFactory.newInstance();
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        try {
            Document document = builder.parse(new File(pathname));
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
