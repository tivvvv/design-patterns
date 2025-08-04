package com.tiv.design.patterns.behavioral.chainofresponsibility.handler;

import com.tiv.design.patterns.behavioral.chainofresponsibility.Course;

/**
 * 课程文档处理者
 */
public class DocumentHandler extends Handler {

    public DocumentHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void approve(Course course) {
        if (course.getDocument() == null) {
            System.out.println(course.getName() + "不包含课程文档,不批准,流程终止");
        } else {
            System.out.println(course.getName() + "包含课程文档,批准");
            if (handler != null) {
                handler.approve(course);
            }
        }
    }

}
