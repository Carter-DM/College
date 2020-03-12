package javacp3561.assignment3;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.util.Scanner;

public class Main {
    static final String STYLESHEETPATH = "src/javacp3561/assignment3/LibraryData.xsl";
    static final String XMLPATH = "src/javacp3561/assignment3/LibraryData.xml";
    static final String OUTPUTPATH = "src/javacp3561/assignment3/LibraryDataOutput.html";

    public static void main(String[] args) throws TransformerException {
        LibraryFactory libraryFactory = new LibraryFactory(XMLPATH);
        Scanner in = new Scanner(System.in);
        String userIn = "";
        while (!userIn.equalsIgnoreCase("x")) {
            System.out.println("What would you like to do?\n============================");
            System.out.printf("Create a new Publisher entry [P]" +
                    "\nCreate a new Author entry [A]" +
                    "\nCreate a new Book entry [B]" +
                    "\nQuit [x]\n");
            userIn = in.nextLine();
            if (userIn.equalsIgnoreCase("p")) {
                libraryFactory.addPublisher(createPublisher(in));
            }
            else if (userIn.equalsIgnoreCase("a")) {
                libraryFactory.addAuthor(createAuthor(in));
            }
            else if (userIn.equalsIgnoreCase("b")) {

            }
            else if (!userIn.equalsIgnoreCase("x")){
                System.out.println("Invalid input.");
            }
        }

        transformXML();
    }

    private static Publisher createPublisher(Scanner in) {
        System.out.print("Enter the publishers ID: ");
        String pubId = in.nextLine();
        System.out.print("\nEnter the publishers name: ");
        String pubName = in.nextLine();
        System.out.print("\nEnter the publisher contact: ");
        String pubContact = in.nextLine();
        System.out.print("\nEnter the publishers phone: ");
        String pubPhone = in.nextLine();
        return new Publisher(pubId, pubName, pubContact, pubPhone);
    }

    private static Author createAuthor(Scanner in) {
        System.out.print("Enter the authors ID: ");
        String authorId = in.nextLine();
        System.out.print("\nEnter the authors last name: ");
        String authorLastName = in.nextLine();
        System.out.print("\nEnter the authors first name: ");
        String authorFirstName = in.nextLine();
        return new Author(authorId, authorLastName, authorFirstName);
    }

    private static Book createBook(Scanner in) {

    }

    private static void transformXML() throws TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        Source stylesheetSource = new StreamSource(new File(STYLESHEETPATH).getAbsoluteFile());
        Transformer transformer = factory.newTransformer(stylesheetSource);
        Source inputSource = new StreamSource(new File(XMLPATH).getAbsoluteFile());
        Result outputResult = new StreamResult(new File(OUTPUTPATH).getAbsoluteFile());
        transformer.transform(inputSource, outputResult);
    }
}
