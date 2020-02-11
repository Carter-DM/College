package javacp3561.assignment2;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

/**
 * Java CP3561 Assignment 2
 * @author Carter Daly-MacPhail 20149926
 *
 * Simple runner java class that performs XML transformation
 */
public class LibraryDataTransformer {

    static final String STYLESHEETPATH = "src/javacp3561/assignment2/LibraryData.xsl";
    static final String XMLPATH = "src/javacp3561/assignment2/LibraryData.xml";
    static final String OUTPUTPATH = "src/javacp3561/assignment2/LibraryDataOutput.html";

    public static void main(String[] args) throws TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        Source stylesheetSource = new StreamSource(new File(STYLESHEETPATH).getAbsoluteFile());
        Transformer transformer = factory.newTransformer(stylesheetSource);

        Source inputSource = new StreamSource(new File(XMLPATH).getAbsoluteFile());

        Result outputResult = new StreamResult(new File(OUTPUTPATH).getAbsoluteFile());

        transformer.transform(inputSource, outputResult);
    }
}
