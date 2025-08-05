package com.tiv.design.patterns.structural.adapter.objectAdapter;

/**
 * 具体目标
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("具体目标方法");
    }

}