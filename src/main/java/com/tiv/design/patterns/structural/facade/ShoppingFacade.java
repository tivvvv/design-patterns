package com.tiv.design.patterns.structural.facade;

import com.tiv.design.patterns.structural.facade.subsystem.PaymentService;
import com.tiv.design.patterns.structural.facade.subsystem.QualifyService;
import com.tiv.design.patterns.structural.facade.subsystem.ShippingService;
import com.tiv.design.patterns.structural.facade.subsystem.StockService;

/**
 * 外观类
 */
public class ShoppingFacade {

    private QualifyService qualifyService;

    private StockService stockService;

    private PaymentService paymentService;

    private ShippingService shippingService;

    public ShoppingFacade() {
        this.qualifyService = new QualifyService();
        this.stockService = new StockService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void buy(Product product) {
        if (!qualifyService.isAvailable(product)) {
            System.out.println("无购买资格");
            return;
        }
        if (!stockService.hasStock(product)) {
            System.out.println("库存不足");
            return;
        }
        paymentService.pay(product);
        stockService.deductStock(product);
        shippingService.ship(product);
    }

}
