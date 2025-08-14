package com.tiv.design.patterns.behavioral.visitor.element;

import com.tiv.design.patterns.behavioral.visitor.Visitor;

/**
 * 衣服(具体元素)
 */
public class Clothing implements Element {

    private String type;

    private double price;

    private String size;

    public Clothing(String type, double price, String size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

}
