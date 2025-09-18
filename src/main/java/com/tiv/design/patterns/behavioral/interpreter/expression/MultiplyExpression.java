package com.tiv.design.patterns.behavioral.interpreter.expression;

public class MultiplyExpression implements Expression {

    private Expression first;

    private Expression second;

    public MultiplyExpression(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int interpret() {
        return this.first.interpret() * this.second.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }

}
