package com.tiv.design.patterns.behavioral.chainofresponsibility;

import com.tiv.design.patterns.behavioral.chainofresponsibility.handler.DocumentHandler;
import com.tiv.design.patterns.behavioral.chainofresponsibility.handler.Handler;
import com.tiv.design.patterns.behavioral.chainofresponsibility.handler.HomeworkHandler;
import com.tiv.design.patterns.behavioral.chainofresponsibility.handler.VideoHandler;

public class Test {

    public static void main(String[] args) {
        Course course = new Course();
        course.setName("语文课");
        course.setVideo("语文课视频");
        course.setDocument("语文课文档");
        course.setHomework("语文课作业");

        // 责任链:视频 -> 文档 -> 作业
        Handler homeworkHandler = new HomeworkHandler(null);
        Handler documentHandler = new DocumentHandler(homeworkHandler);
        Handler videoHandler = new VideoHandler(documentHandler);

        videoHandler.approve(course);
    }

}
