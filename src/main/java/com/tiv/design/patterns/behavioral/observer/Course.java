package com.tiv.design.patterns.behavioral.observer;

import java.util.Observable;

/**
 * 课程-被观察者
 */
public class Course extends Observable {

    private String name;

    public String getName() {
        return name;
    }

    public Course(String name) {
        this.name = name;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.printf("%s在<<%s>>课程中提交了一个问题%n", question.getUser(), course.name);
        setChanged();
        notifyObservers(question);
    }

}
