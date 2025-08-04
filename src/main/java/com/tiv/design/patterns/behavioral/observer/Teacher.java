package com.tiv.design.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 老师-观察者
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.printf("%s老师在<<%s>>课程中收到一个%s提交的问题%n", name, course.getName(), question.getUser());
    }

}
