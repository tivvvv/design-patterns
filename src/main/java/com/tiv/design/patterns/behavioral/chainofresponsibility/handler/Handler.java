package com.tiv.design.patterns.behavioral.chainofresponsibility.handler;

import com.tiv.design.patterns.behavioral.chainofresponsibility.Course;

/**
 * 处理者
 */
public abstract class Handler {

    /**
     * 下一个处理者
     */
    protected Handler handler;

    public Handler(Handler nextHandler) {
        this.handler = nextHandler;
    }

    /**
     * 审批课程
     *
     * @param course
     */
    public abstract void approve(Course course);

}
