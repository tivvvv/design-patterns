package com.tiv.design.patterns.behavioral.strategy;

import com.tiv.design.patterns.behavioral.strategy.promotion.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 促销策略工厂
 */
public class PromotionStrategyFactory {

    private static final Map<String, PromotionStrategy> promotionStrategyMap = new HashMap<>();

    static {
        promotionStrategyMap.put(PromotionStrategyKeys.INSTANT_DISCOUNT, new InstantDiscountPromotionStrategy());
        promotionStrategyMap.put(PromotionStrategyKeys.THRESHOLD_DISCOUNT, new ThresholdDiscountPromotionStrategy());
        promotionStrategyMap.put(PromotionStrategyKeys.CASHBACK, new CashbackPromotionStrategy());
        promotionStrategyMap.put(PromotionStrategyKeys.DEFAULT, new DefaultPromotionStrategy());
    }

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = promotionStrategyMap.get(promotionKey);
        return promotionStrategy == null ? promotionStrategyMap.get(PromotionStrategyKeys.DEFAULT) : promotionStrategy;
    }

}
