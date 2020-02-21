package javacp3561.assignment3;

public class Book {
    private String isbn;
    private String title;
    private String datePublished;
    private String publisherId;
    private float cost;
    private float retail;
    private float discount;
    private String category;

    public Book (String isbn, String title, String datePublished, String publisherId, float cost, float retail, float discount, String category) {
        this.isbn = isbn;
        this.title = title;
        this.datePublished = datePublished;
        this.publisherId = publisherId;
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

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getRetail() {
        return retail;
    }

    public void setRetail(float retail) {
        this.retail = retail;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
