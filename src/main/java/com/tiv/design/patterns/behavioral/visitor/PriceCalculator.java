package com.tiv.design.patterns.behavioral.visitor;

import com.tiv.design.patterns.behavioral.visitor.element.Book;
import com.tiv.design.patterns.behavioral.visitor.element.Clothing;
import com.tiv.design.patterns.behavioral.visitor.element.Electronic;

/**
 * 价格计算器(具体访问者)
 */
public class PriceCalculator implements Visitor {

    private double total;

    @Override
    public void visit(Book book) {
        System.out.printf("书籍:%s 价格:%s元%n", book.getTitle(), book.getPrice());
        total += book.getPrice();
    }

    @Override
    public void visit(Clothing clothing) {
        System.out.printf("衣服:%s 尺码:%s 价格:%s元%n", clothing.getType(), clothing.getSize(), clothing.getPrice());
        total += clothing.getPrice();
    }

    @Override
    public void visit(Electronic electronic) {
        // 电子产品加收15%的税
        double priceWithTax = electronic.getPrice() * 1.15;
        System.out.printf("电子产品:%s 原价:%s元 含税价:%s元%n", electronic.getName(), electronic.getPrice(), priceWithTax);
        total += priceWithTax;
    }

    public double getTotal() {
        return total;
    }

}
