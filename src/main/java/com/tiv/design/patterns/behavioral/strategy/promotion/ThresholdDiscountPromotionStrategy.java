package com.tiv.design.patterns.behavioral.strategy.promotion;

/**
 * 满减策略
 */
public class ThresholdDiscountPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("满减策略,满200减20");
    }

}
