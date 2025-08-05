package com.tiv.design.patterns.structural.facade.subsystem;

import com.tiv.design.patterns.structural.facade.Product;

/**
 * 支付服务
 */
public class PaymentService {

    public boolean pay(Product product) {
        System.out.println(product.getName() + "商品支付成功");
        return true;
    }

}
