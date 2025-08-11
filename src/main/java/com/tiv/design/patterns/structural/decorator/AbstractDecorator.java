package com.tiv.design.patterns.structural.decorator;

/**
 * 抽象装饰者
 */
public abstract class AbstractDecorator extends AbstractPancake {

    private AbstractPancake abstractPancake;

    public AbstractDecorator(AbstractPancake abstractPancake) {
        this.abstractPancake = abstractPancake;
    }

    @Override
    protected String getDesc() {
        return this.abstractPancake.getDesc();
    }

    @Override
    protected int cost() {
        return this.abstractPancake.cost();
    }

    // 如果装饰者不需要实现自己独有的方法,最上层装饰者可以不是抽象类
    protected abstract void doSomething();

}
