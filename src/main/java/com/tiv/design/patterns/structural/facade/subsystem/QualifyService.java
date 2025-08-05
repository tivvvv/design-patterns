package com.tiv.design.patterns.structural.facade.subsystem;

import com.tiv.design.patterns.structural.facade.Product;

/**
 * 资格检测服务
 */
public class QualifyService {

    public boolean isAvailable(Product product) {
        System.out.println(product.getName() + "商品购买资格校验通过");
        return true;
    }

}
