package com.tiv.design.patterns.behavioral.visitor.element;

import com.tiv.design.patterns.behavioral.visitor.Visitor;

/**
 * 电子产品(具体元素)
 */
public class Electronic implements Element {

    private String name;

    private double price;

    private int warranty;

    public Electronic(String name, double price, int warranty) {
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", warranty=" + warranty +
                '}';
    }

}
