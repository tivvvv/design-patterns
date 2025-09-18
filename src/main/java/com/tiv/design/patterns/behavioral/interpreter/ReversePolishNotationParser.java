package com.tiv.design.patterns.behavioral.interpreter;

import com.tiv.design.patterns.behavioral.interpreter.expression.AddExpression;
import com.tiv.design.patterns.behavioral.interpreter.expression.Expression;
import com.tiv.design.patterns.behavioral.interpreter.expression.MultiplyExpression;
import com.tiv.design.patterns.behavioral.interpreter.expression.NumberExpression;

import java.util.Stack;

public class ReversePolishNotationParser {

    private Stack<Expression> stack = new Stack<>();

    public int parse(String expressions) {
        String[] splits = expressions.split(" ");
        for (String symbol : splits) {
            if (!isOperator(symbol)) {
                // 数字
                Expression numberExpression = new NumberExpression(Integer.parseInt(symbol));
                stack.push(numberExpression);
                System.out.printf("入栈: %d%n", numberExpression.interpret());
            } else {
                // 符号
                Expression first = stack.pop();
                Expression second = stack.pop();
                System.out.printf("出栈: %d 和 %d%n", first.interpret(), second.interpret());
                Expression operator = operateExpression(symbol, first, second);
                System.out.printf("应用运算符: %s%n", operator);
                int result = operator.interpret();
                NumberExpression numberExpression = new NumberExpression(result);
                stack.push(numberExpression);
                System.out.printf("阶段结果入栈: %d%n", numberExpression.interpret());
            }
        }
        return stack.pop().interpret();
    }

    private Expression operateExpression(String symbol, Expression first, Expression second) {
        if ("+".equals(symbol)) {
            return new AddExpression(first, second);
        } else if ("*".equals(symbol)) {
            return new MultiplyExpression(first, second);
        }
        return null;
    }

    private boolean isOperator(String symbol) {
        return "+".equals(symbol) || "*".equals(symbol);
    }

}
