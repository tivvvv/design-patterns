package com.tiv.design.patterns.behavioral.visitor;

import com.tiv.design.patterns.behavioral.visitor.element.Book;
import com.tiv.design.patterns.behavioral.visitor.element.Clothing;
import com.tiv.design.patterns.behavioral.visitor.element.Electronic;

public class Test {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem(new Book("Java编程思想", 55.0, "大李"));
        cart.addItem(new Book("Java核心技术", 28.0, "大刘"));
        cart.addItem(new Clothing("大衣", 88888, "XL"));
        cart.addItem(new Electronic("电脑", 10000, 3));

        DescriptionPrinter descriptionPrinter = new DescriptionPrinter();
        System.out.println("商品信息");
        cart.accept(descriptionPrinter);

        PriceCalculator priceCalculator = new PriceCalculator();
        System.out.println("价格明细");
        cart.accept(priceCalculator);
        System.out.printf("总价: %s元%n", priceCalculator.getTotal());
    }

}
