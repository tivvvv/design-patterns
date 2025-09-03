package com.tiv.design.patterns.structural.proxy;

public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao = new OrderDaoImpl();

    @Override
    public int saveOrder(Order order) {
        System.out.println("Service层调用Dao层添加Order");
        return orderDao.insert(order);
    }

}
