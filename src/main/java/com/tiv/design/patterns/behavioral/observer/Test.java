package com.tiv.design.patterns.behavioral.observer;

public class Test {

    public static void main(String[] args) {
        Course course = new Course("设计模式精讲");

        Teacher teacher1 = new Teacher("大李");
        course.addObserver(teacher1);
        Teacher teacher2 = new Teacher("大张");
        course.addObserver(teacher2);

        Question question = new Question("小王", "观察者模式是什么?");
        course.produceQuestion(course, question);
    }

}
