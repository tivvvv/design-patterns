package com.tiv.design.patterns.creational.abstractfactory.java;

import com.tiv.design.patterns.creational.abstractfactory.CourseFactory;
import com.tiv.design.patterns.creational.abstractfactory.Note;
import com.tiv.design.patterns.creational.abstractfactory.Video;

/**
 * Java课程工厂
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Note getNote() {
        return new JavaNote();
    }

}
