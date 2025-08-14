package com.tiv.design.patterns.behavioral.visitor;

import com.tiv.design.patterns.behavioral.visitor.element.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * 购物车
 */
public class Cart {

    private List<Element> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Element item) {
        items.add(item);
    }

    public void removeItem(Element item) {
        items.remove(item);
    }

    public void accept(Visitor visitor) {
        for (Element item : items) {
            item.accept(visitor);
        }
    }

}
