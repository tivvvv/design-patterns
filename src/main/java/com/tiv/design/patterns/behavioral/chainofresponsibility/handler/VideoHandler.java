package com.tiv.design.patterns.behavioral.chainofresponsibility.handler;

import com.tiv.design.patterns.behavioral.chainofresponsibility.Course;

/**
 * 课程视频处理者
 */
public class VideoHandler extends Handler {

    public VideoHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void approve(Course course) {
        if (course.getVideo() == null) {
            System.out.println(course.getName() + "不包含课程视频,不批准,流程终止");
        } else {
            System.out.println(course.getName() + "包含课程视频,批准");
            if (handler != null) {
                handler.approve(course);
            }
        }
    }

}
