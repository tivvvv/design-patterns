package com.tiv.design.patterns.behavioral.observer;

/**
 * 问题
 */
public class Question {

    private String content;

    private String user;

    public Question(String user, String content) {
        this.user = user;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
