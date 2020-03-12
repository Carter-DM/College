package javacp3561.assignment3;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
                createPublisher(in, libraryFactory);
            }
            else if (userIn.equalsIgnoreCase("a")) {
                createAuthor(in, libraryFactory);
            }
            else if (userIn.equalsIgnoreCase("b")) {
                createBook(in, libraryFactory);
            }
            else if (!userIn.equalsIgnoreCase("x")){
                System.out.println("Invalid input.");
            }
        }
        transformXML();
    }

    private static void createPublisher(Scanner in, LibraryFactory libraryFactory) {
        System.out.print("Enter the publishers ID: ");
        String pubId = in.nextLine();
        System.out.print("\nEnter the publishers name: ");
        String pubName = in.nextLine();
        System.out.print("\nEnter the publisher contact: ");
        String pubContact = in.nextLine();
        System.out.print("\nEnter the publishers phone: ");
        String pubPhone = in.nextLine();
        libraryFactory.addPublisher(new Publisher(pubId, pubName, pubContact, pubPhone));
        System.out.printf("\nPublisher %s entry successfully created.\n", pubId);
    }

    private static void createAuthor(Scanner in, LibraryFactory libraryFactory) {
        System.out.print("Enter the authors ID: ");
        String authorId = in.nextLine();
        System.out.print("\nEnter the authors last name: ");
        String authorLastName = in.nextLine();
        System.out.print("\nEnter the authors first name: ");
        String authorFirstName = in.nextLine();
        libraryFactory.addAuthor(new Author(authorId, authorLastName, authorFirstName, new ArrayList<>()));
        System.out.printf("\nAuthor %s entry successfully created.\n", authorId);
    }

    private static void createBook(Scanner in, LibraryFactory libraryFactory) {
        System.out.print("Enter the books ISBN: ");
        String bookIsbn = in.nextLine();
        System.out.print("\nEnter the books title: ");
        String bookTitle = in.nextLine();
        System.out.print("\nEnter the books author ids (comma seperated): ");
        String bookAuthors = in.nextLine();
        List<Author> bookAuthorsList = getAuthors(in, libraryFactory, bookAuthors);
        System.out.print("\nEnter the books publish date: ");
        String bookDatePublished = in.nextLine();
        System.out.print("\nEnter the books publisher ID: ");
        String bookPublisherId = in.nextLine();
        if (getPublisher(libraryFactory.getPublishers(), bookPublisherId) == null) {
            System.out.println("\nA publisher with this ID does not exist, creating new publisher entry...\n");
            createPublisher(in, libraryFactory);
        }
        Publisher bookPublisher = getPublisher(libraryFactory.getPublishers(), bookPublisherId);
        System.out.println(bookPublisher.getName());
        System.out.print("\nEnter the books cost: ");
        String bookCost = in.nextLine();
        System.out.print("\nEnter the books retail price: ");
        String bookRetail = in.nextLine();
        System.out.print("\nEnter the books discount value: ");
        String bookDiscount = in.nextLine();
        System.out.print("\nEnter the books category: ");
        String bookCategory = in.nextLine();
        libraryFactory.addBook(new Book(
                bookIsbn,
                bookTitle,
                bookAuthorsList,
                bookDatePublished,
                bookPublisher,
                bookCost,
                bookRetail,
                bookDiscount,
                bookCategory
        ));
    }

    private static List<Author> getAuthors(Scanner in, LibraryFactory libraryFactory, String authorIds) {
        List<Author> bookAuthors = new ArrayList<>();
        List<String> authorIdList = Arrays.asList(authorIds.split("\\s*,\\s*"));
        for (String authorId: authorIdList) {
            if (getAuthor(libraryFactory.getAuthors(), authorId) == null) {
                System.out.printf("\nAn author with the ID %s does not exist, creating new author entry...\n", authorId);
                createAuthor(in, libraryFactory);
            }
            bookAuthors.add(getAuthor(libraryFactory.getAuthors(), authorId));
        }
        return bookAuthors;
    }

    private static Author getAuthor(List<Author> authors, String authorId) {
        for (Author author: authors) {
            if (author.getId().equalsIgnoreCase(authorId)) {
                return author;
            }
        }
        return null;
    }


    private static Publisher getPublisher(List<Publisher> publishers, String publisherId) {
        for (Publisher publisher: publishers) {
            if (publisher.getId().equalsIgnoreCase(publisherId)) {
                return publisher;
            }
        }
        return null;
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
