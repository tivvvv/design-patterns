package com.tiv.design.patterns.behavioral.visitor.element;

import com.tiv.design.patterns.behavioral.visitor.Visitor;

/**
 * 元素接口
 */
public interface Element {

    void accept(Visitor visitor);

}
