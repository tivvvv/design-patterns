package com.tiv.design.patterns.behavioral.visitor.element;

import com.tiv.design.patterns.behavioral.visitor.Visitor;

/**
 * 书籍(具体元素)
 */
public class Book implements Element {

    private String title;

    private double price;

    private String author;

    public Book(String title, double price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

}
