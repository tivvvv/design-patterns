package com.tiv.design.patterns.structural.proxy.dynamicproxy;

import com.tiv.design.patterns.structural.proxy.Order;
import com.tiv.design.patterns.structural.proxy.OrderService;
import com.tiv.design.patterns.structural.proxy.OrderServiceImpl;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        OrderService orderServiceDynamicProxy = (OrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }

}
