package com.tiv.design.patterns.structural.proxy;

public class OrderDaoImpl implements OrderDao {

    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }

}
