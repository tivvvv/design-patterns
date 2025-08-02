package com.tiv.design.patterns.creational.abstractfactory.python;

import com.tiv.design.patterns.creational.abstractfactory.CourseFactory;
import com.tiv.design.patterns.creational.abstractfactory.Note;
import com.tiv.design.patterns.creational.abstractfactory.Video;

/**
 * Python课程工厂
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Note getNote() {
        return new PythonNote();
    }

}
