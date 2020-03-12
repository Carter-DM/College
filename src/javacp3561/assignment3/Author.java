package javacp3561.assignment3;

import java.util.List;

public class Author {
    private String id;
    private String lastName;
    private String firstName;

    private List<Book> books;

    public Author(String id, String lastName, String firstName, List<Book> books) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.books = books;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
