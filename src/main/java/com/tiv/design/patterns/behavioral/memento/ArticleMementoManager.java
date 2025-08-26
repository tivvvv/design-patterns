package com.tiv.design.patterns.behavioral.memento;

import java.util.Stack;

public class ArticleMementoManager {

    private final Stack<ArticleMemento> mementoStack = new Stack<>();

    public void addMemento(ArticleMemento memento) {
        mementoStack.push(memento);
    }

    public ArticleMemento getMemento() {
        return mementoStack.pop();
    }

}
