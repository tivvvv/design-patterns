package com.tiv.design.patterns.behavioral.memento;

public class Article {

    private String title;

    private String author;

    private String content;

    public Article(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public ArticleMemento saveToMemento() {
        return new ArticleMemento(title, author, content);
    }

    public void restoreFromMemento(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.author = articleMemento.getAuthor();
        this.content = articleMemento.getContent();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

}
