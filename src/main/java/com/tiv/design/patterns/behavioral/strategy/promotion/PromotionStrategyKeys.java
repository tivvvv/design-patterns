package com.tiv.design.patterns.behavioral.strategy.promotion;

/**
 * 促销策略键
 */
public interface PromotionStrategyKeys {

    String DEFAULT = "defaultPromotionStrategy";

    String CASHBACK = "cashbackPromotionStrategy";

    String INSTANT_DISCOUNT = "instantDiscountPromotionStrategy";

    String THRESHOLD_DISCOUNT = "thresholdDiscountPromotionStrategy";

}
