package com.tiv.design.patterns.behavioral.chainofresponsibility.handler;

import com.tiv.design.patterns.behavioral.chainofresponsibility.Course;

/**
 * 课程作业处理者
 */
public class HomeworkHandler extends Handler {

    public HomeworkHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void approve(Course course) {
        if (course.getHomework() == null) {
            System.out.println(course.getName() + "不包含课程作业,不批准,流程终止");
        } else {
            System.out.println(course.getName() + "包含课程作业,批准");
            if (handler != null) {
                handler.approve(course);
            }
        }
    }

}
