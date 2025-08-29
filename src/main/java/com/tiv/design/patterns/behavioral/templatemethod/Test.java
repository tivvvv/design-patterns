package com.tiv.design.patterns.behavioral.templatemethod;

public class Test {

    public static void main(String[] args) {
        System.out.println("英语课程:");
        Course course1 = new EnglishCourse(true);
        course1.makeCourse();
        System.out.println();

        System.out.println("数学课程:");
        Course course2 = new MathCourse();
        course2.makeCourse();
    }

}
