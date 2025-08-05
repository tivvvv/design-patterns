package com.tiv.design.patterns.structural.facade.subsystem;

import com.tiv.design.patterns.structural.facade.Product;

/**
 * 物流服务
 */
public class ShippingService {

    public String ship(Product product) {
        String trackingId = "123456";
        System.out.println(product.getName() + "商品已发货,物流单号:" + trackingId);
        return trackingId;
    }

}
