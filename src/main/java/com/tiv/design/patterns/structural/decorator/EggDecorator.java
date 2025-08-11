package com.tiv.design.patterns.structural.decorator;

/**
 * 鸡蛋装饰者
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(AbstractPancake abstractPancake) {
        super(abstractPancake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加1个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }

    @Override
    protected void doSomething() {
    }

}
