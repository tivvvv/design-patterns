package com.tiv.design.patterns.creational.abstractfactory;

import com.tiv.design.patterns.creational.abstractfactory.c.CCourseFactory;

public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new CCourseFactory();

        Note note = courseFactory.getNote();
        note.read();

        Video video = courseFactory.getVideo();
        video.play();
    }

}
