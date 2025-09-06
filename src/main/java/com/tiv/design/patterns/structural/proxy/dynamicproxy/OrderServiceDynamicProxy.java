package com.tiv.design.patterns.structural.proxy.dynamicproxy;

import com.tiv.design.patterns.structural.proxy.DataSourceContextHolder;
import com.tiv.design.patterns.structural.proxy.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj) {
        System.out.println("动态代理 beforeMethod 执行");
        if (obj instanceof Order) {
            Order order = (Order) obj;
            int userId = order.getUserId();
            int dbRouter = userId % 2;
            DataSourceContextHolder.setDBType("db" + dbRouter);
            System.out.println("动态代理 数据库路由到db" + dbRouter + "处理数据");
        }
    }

    private void afterMethod() {
        System.out.println("动态代理 afterMethod 执行");
    }

}
