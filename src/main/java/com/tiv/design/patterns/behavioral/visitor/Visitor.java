package com.tiv.design.patterns.behavioral.visitor;

import com.tiv.design.patterns.behavioral.visitor.element.Book;
import com.tiv.design.patterns.behavioral.visitor.element.Clothing;
import com.tiv.design.patterns.behavioral.visitor.element.Electronic;

/**
 * 访问者接口
 */
public interface Visitor {

    void visit(Book book);

    void visit(Clothing clothing);

    void visit(Electronic electronic);

}
