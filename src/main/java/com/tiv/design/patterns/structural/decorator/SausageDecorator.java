package com.tiv.design.patterns.structural.decorator;

/**
 * 香肠装饰者
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(AbstractPancake abstractPancake) {
        super(abstractPancake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加1根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 3;
    }

    @Override
    protected void doSomething() {
    }

}
