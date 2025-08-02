package com.tiv.design.patterns.creational.abstractfactory.c;

import com.tiv.design.patterns.creational.abstractfactory.CourseFactory;
import com.tiv.design.patterns.creational.abstractfactory.Note;
import com.tiv.design.patterns.creational.abstractfactory.Video;

/**
 * C课程工厂
 */
public class CCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new CVideo();
    }

    @Override
    public Note getNote() {
        return new CNote();
    }

}
