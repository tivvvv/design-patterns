package com.tiv.design.patterns.structural.decorator;

public class Test {

    public static void main(String[] args) {
        // 加1个鸡蛋和1根香肠
        AbstractPancake abstractPancake = new Pancake();
        abstractPancake = new EggDecorator(abstractPancake);
        abstractPancake = new SausageDecorator(abstractPancake);
        System.out.printf("%s,总价格为:%s%n", abstractPancake.getDesc(), abstractPancake.cost());

        // 再加1个鸡蛋
        abstractPancake = new EggDecorator(abstractPancake);
        System.out.printf("%s,总价格为:%s%n", abstractPancake.getDesc(), abstractPancake.cost());
    }

}
