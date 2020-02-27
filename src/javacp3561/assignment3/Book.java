package javacp3561.assignment3;

import java.util.List;

public class Book {
    private String isbn;
    private String title;
    private List<Author> author;
    private String datePublished;
    private Publisher publisher;
    private String cost;
    private String retail;
    private String discount;
    private String category;

    public Book (String isbn, String title, List<Author> author, String datePublished, Publisher publisher, String cost, String retail, String discount, String category) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.datePublished = datePublished;
        this.publisher = publisher;
        this.cost = cost;
        this.retail = retail;
        this.discount = discount;
        this.category = category;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getRetail() {
        return retail;
    }

    public void setRetail(String retail) {
        this.retail = retail;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
