package com.tiv.design.patterns.behavioral.strategy.promotion;

/**
 * 立减策略
 */
public class InstantDiscountPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("立减促销,所有商品降价20");
    }

}
