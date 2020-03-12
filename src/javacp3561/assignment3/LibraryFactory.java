package javacp3561.assignment3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LibraryFactory class.
 * Takes path to XML doc and parses XML to and from Objects.
 */
public class LibraryFactory {
    private DocumentBuilderFactory factory;
    private DocumentBuilder builder;
    private Document document;
    private TransformerFactory transformerFactory;
    private Transformer transformer;
    private DOMSource source;
    private StreamResult result;
    private List<Publisher> publishers;
    private List<Author> authors;
    private List<Book> books;

    public LibraryFactory(String pathname) {
        factory = DocumentBuilderFactory.newInstance();
        try {
            builder = factory.newDocumentBuilder();
            document = builder.parse(new File(pathname));

            source = new DOMSource(document);
            transformerFactory = TransformerFactory.newInstance();
            transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            result = new StreamResult(pathname);

        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            e.printStackTrace();
        }

        parseXMLTObjects();
    }

    public void parseXMLTObjects() {
        parsePublisher();
        parseAuthor();
        parseBook();
    }

    public List<Publisher> getPublishers() {
        return publishers;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Book> getBooks() {
        return books;
    }

    /**
     * Parses XML and adds Publisher objects to publishers list
     */
    private void parsePublisher() {
        NodeList nodeList = document.getElementsByTagName("publisher");
        publishers = new ArrayList<Publisher>();
        for (int i = 0; i < nodeList.getLength(); i++)
        {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element element = (Element) node;
                publishers.add(new Publisher(
                        element.getAttribute("id"),
                        element.getElementsByTagName("name").item(0).getTextContent(),
                        element.getElementsByTagName("contact").item(0).getTextContent(),
                        element.getElementsByTagName("phone").item(0).getTextContent()
                ));
            }
        }
    }

    /**
     * Parses XML and adds Author objects to authors list
     */
    private void parseAuthor() {
        NodeList nodeList = document.getElementsByTagName("author");
        authors = new ArrayList<Author>();
        for (int i = 0; i < nodeList.getLength(); i++)
        {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element element = (Element) node;
                authors.add(new Author(
                        element.getAttribute("id"),
                        element.getElementsByTagName("lastName").item(0).getTextContent(),
                        element.getElementsByTagName("firstName").item(0).getTextContent()
                ));
            }
        }
    }

    /**
     * Parses XML and adds Book objects to books List
     */
    private void parseBook() {
        NodeList nodeList = document.getElementsByTagName("book");
        books = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++)
        {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element element = (Element) node;
                books.add(new Book(
                        element.getAttribute("isbn"),
                        element.getElementsByTagName("title").item(0).getTextContent(),
                        getBookAuthors(element),
                        element.getElementsByTagName("datePublished").item(0).getTextContent(),
                        getBookPublisher(element),
                        element.getElementsByTagName("cost").item(0).getTextContent(),
                        element.getElementsByTagName("retail").item(0).getTextContent(),
                        element.getElementsByTagName("discount").item(0).getTextContent(),
                        element.getElementsByTagName("category").item(0).getTextContent()
                ));
            }
        }
    }

    /**
     * Returns a list of Authors associated with the book based on the BookAuthors bridge table.
     * @param bookNode
     * @return List<Author>
     */
    private List<Author> getBookAuthors(Element bookNode) {
        NodeList bookAuthorNodeList = document.getElementsByTagName("bookAuthor");
        List<Author> bookAuthors = new ArrayList<>();
        for (int i = 0; i < bookAuthorNodeList.getLength(); i++) {
            Node bookAuthorNode = bookAuthorNodeList.item(i);
            Element bookAuthorElement = (Element) bookAuthorNode;
            if (bookAuthorElement.getAttribute("isbn").equalsIgnoreCase(bookNode.getAttribute("isbn"))) {
                for (Author author: authors) {
                    if (bookAuthorElement.getAttribute("id").equalsIgnoreCase(author.getId())) {
                        bookAuthors.add(author);
                    }
                }
            }
        }
        return bookAuthors;
    }

    /**
     * Returns the Publisher associated with the Books Publisher ID. Will throw null pointer if no publisher is found.
     * @param bookNode
     * @return Publisher
     */
    private Publisher getBookPublisher(Element bookNode) {
        String publisherId = bookNode.getElementsByTagName("publisherId").item(0).getTextContent();
            for (Publisher publisher : publishers) {
                if (publisherId.equalsIgnoreCase(publisher.getId())) {
                    return publisher;
                }
            }
        throw new NullPointerException("There is no publisher with the ID you specified.");
    }

    /**
     * Appends a new Publisher node to the LibraryData.xml file
     * @param publisher
     */
    public void addPublisher(Publisher publisher) {
        Element element = document.createElement("publisher");
        NodeList publishers = document.getElementsByTagName("publishers");

        element.setAttribute("id", publisher.getId());
        Element name = document.createElement("name");
        Element contact = document.createElement("contact");
        Element phone = document.createElement("phone");

        name.appendChild(document.createTextNode(publisher.getName()));
        contact.appendChild(document.createTextNode(publisher.getContact()));
        phone.appendChild(document.createTextNode(publisher.getPhone()));

        element.appendChild(name);
        element.appendChild(contact);
        element.appendChild(phone);

        publishers.item(publishers.getLength() - 1).appendChild(element);
        try {
            transformer.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    /**
     * Appends a new Author node to the LibraryData.xml file.
     * @param author
     */
    public void addAuthor(Author author) {
        Element element = document.createElement("author");
        NodeList authors = document.getElementsByTagName("authors");

        element.setAttribute("id", author.getId());
        Element lastName = document.createElement("lastName");
        Element firstName = document.createElement("firstName");

        lastName.appendChild(document.createTextNode(author.getLastName()));
        firstName.appendChild(document.createTextNode(author.getFirstName()));

        element.appendChild(lastName);
        element.appendChild(firstName);

        authors.item(authors.getLength() - 1).appendChild(element);
        try {
            transformer.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    /**
     * Appends a new Book node to the LibraryData.xml file.
     * @param book
     */
    public void addBook(Book book) {
        Element element = document.createElement("book");
        NodeList books = document.getElementsByTagName("books");

        element.setAttribute("isbn", book.getIsbn());
        Element title = document.createElement("title");
        Element datePublished = document.createElement("datePublished");
        Element publisherId = document.createElement("publisherId");
        Element cost = document.createElement("cost");
        Element retail = document.createElement("retail");
        Element discount = document.createElement("discount");
        Element category = document.createElement("category");

        title.appendChild(document.createTextNode(book.getTitle()));
        datePublished.appendChild(document.createTextNode(book.getDatePublished()));
        publisherId.appendChild(document.createTextNode(book.getPublisher().getId()));
        cost.appendChild(document.createTextNode(book.getCost()));
        retail.appendChild(document.createTextNode(book.getRetail()));
        discount.appendChild(document.createTextNode(book.getDiscount()));
        category.appendChild(document.createTextNode(book.getCategory()));

        element.appendChild(title);
        element.appendChild(datePublished);
        element.appendChild(publisherId);
        element.appendChild(cost);
        element.appendChild(retail);
        element.appendChild(discount);
        element.appendChild(category);

        addBookAuthor(book);

        books.item(books.getLength() - 1).appendChild(element);
        try {
            transformer.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    /**
     * Appends a new BookAuthor node to the LibraryData.xml file.
     * @param book
     */
    private void addBookAuthor(Book book){
        NodeList bookAuthors = document.getElementsByTagName("bookAuthors");

        for (Author author: book.getAuthors()) {
            Element element = document.createElement("bookAuthor");
            element.setAttribute("id", author.getId());
            element.setAttribute("isbn", book.getIsbn());
            bookAuthors.item(bookAuthors.getLength() - 1).appendChild(element);
        }
    }
}
