package com.tiv.design.patterns.behavioral.strategy;

import com.tiv.design.patterns.behavioral.strategy.promotion.PromotionStrategy;

/**
 * 促销活动
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public void executePromotion() {
        promotionStrategy.doPromotion();
    }

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public PromotionStrategy getPromotionStrategy() {
        return promotionStrategy;
    }

    public void setPromotionStrategy(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

}
