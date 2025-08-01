package com.tiv.design.patterns.behavioral.strategy.promotion;

/**
 * 默认策略
 */
public class DefaultPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("默认策略,无优惠");
    }

}
