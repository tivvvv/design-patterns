package com.tiv.design.patterns.behavioral.strategy.promotion;

/**
 * 返现策略
 */
public class CashbackPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现促销,返还售价5%到余额中");
    }

}
