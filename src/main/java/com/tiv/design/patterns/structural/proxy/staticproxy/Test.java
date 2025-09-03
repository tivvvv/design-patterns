package com.tiv.design.patterns.structural.proxy.staticproxy;

import com.tiv.design.patterns.structural.proxy.Order;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }

}
