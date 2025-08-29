package com.tiv.design.patterns.behavioral.templatemethod;

public class MathCourse extends Course {

    @Override
    void makeAttachment() {
        System.out.println("提供数学试卷");
    }

}
