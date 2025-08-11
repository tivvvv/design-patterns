package com.tiv.design.patterns.structural.decorator;

/**
 * 煎饼
 */
public class Pancake extends AbstractPancake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 5;
    }

}
