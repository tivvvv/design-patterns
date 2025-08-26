package com.tiv.design.patterns.behavioral.memento;

public class Test {

    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article article = new Article("语文", "匿名", "语文内容");
        System.out.println("文章:" + article);

        articleMementoManager.addMemento(article.saveToMemento());

        article.setTitle("数学");
        article.setAuthor("李白");
        System.out.println("修改后文章:" + article);
        articleMementoManager.addMemento(article.saveToMemento());

        article.setTitle("英语");
        article.setContent("英语内容");
        System.out.println("修改后文章:" + article);

        ArticleMemento memento1 = articleMementoManager.getMemento();
        article.restoreFromMemento(memento1);
        System.out.println("回退后文章:" + article);

        ArticleMemento memento2 = articleMementoManager.getMemento();
        article.restoreFromMemento(memento2);
        System.out.println("回退后文章:" + article);
    }

}
