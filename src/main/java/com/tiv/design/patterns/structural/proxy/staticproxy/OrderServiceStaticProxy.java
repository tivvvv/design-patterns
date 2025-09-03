package com.tiv.design.patterns.structural.proxy.staticproxy;

import com.tiv.design.patterns.structural.proxy.DataSourceContextHolder;
import com.tiv.design.patterns.structural.proxy.Order;
import com.tiv.design.patterns.structural.proxy.OrderService;
import com.tiv.design.patterns.structural.proxy.OrderServiceImpl;

public class OrderServiceStaticProxy {

    private OrderService orderService = new OrderServiceImpl();

    public int saveOrder(Order order) {
        beforeMethod(order);
        int result = orderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        System.out.println("静态代理 beforeMethod 执行");
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        DataSourceContextHolder.setDBType("db" + dbRouter);
        System.out.println("静态代理 数据库路由到db" + dbRouter + "处理数据");
    }

    private void afterMethod() {
        System.out.println("静态代理 afterMethod 执行");
    }

}
