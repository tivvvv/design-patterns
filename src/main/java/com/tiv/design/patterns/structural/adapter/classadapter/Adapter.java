package com.tiv.design.patterns.structural.adapter.classadapter;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        // 目标的request方法的具体实现通过Adapter移交给Adaptee
        super.adapteeRequest();
    }

}
