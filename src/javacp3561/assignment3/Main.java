package javacp3561.assignment3;

public class Main {
    public static void main(String[] args) {
        LibraryFactory libraryFactory = new LibraryFactory("src/javacp3561/assignment3/LibraryData.xml");
        System.out.println(libraryFactory.getBooks().size());
    }
}
