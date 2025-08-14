package com.tiv.design.patterns.behavioral.visitor;

import com.tiv.design.patterns.behavioral.visitor.element.Book;
import com.tiv.design.patterns.behavioral.visitor.element.Clothing;
import com.tiv.design.patterns.behavioral.visitor.element.Electronic;

/**
 * 描述打印器(具体访问者)
 */
public class DescriptionPrinter implements Visitor {

    @Override
    public void visit(Book book) {
        System.out.println(book.toString());
    }

    @Override
    public void visit(Clothing clothing) {
        System.out.println(clothing.toString());
    }

    @Override
    public void visit(Electronic electronic) {
        System.out.println(electronic.toString());
    }

}