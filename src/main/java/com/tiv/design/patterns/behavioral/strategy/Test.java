package com.tiv.design.patterns.behavioral.strategy;

import com.tiv.design.patterns.behavioral.strategy.promotion.PromotionStrategyKeys;

public class Test {

    public static void main(String[] args) {
        String promotionKey = PromotionStrategyKeys.INSTANT_DISCOUNT;
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotion();
    }

}
