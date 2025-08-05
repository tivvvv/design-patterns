package com.tiv.design.patterns.structural.facade.subsystem;

import com.tiv.design.patterns.structural.facade.Product;

/**
 * 仓储服务
 */
public class StockService {

    public boolean hasStock(Product product) {
        System.out.println(product.getName() + "商品库存充足");
        return true;
    }

    public boolean deductStock(Product product) {
        System.out.println(product.getName() + "商品库存扣减成功");
        return true;
    }

}
