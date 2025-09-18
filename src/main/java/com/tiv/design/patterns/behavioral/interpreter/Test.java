package com.tiv.design.patterns.behavioral.interpreter;

public class Test {

    public static void main(String[] args) {
        String rpn = "7 100 5 + *";
        ReversePolishNotationParser reversePolishNotationParser = new ReversePolishNotationParser();
        int result = reversePolishNotationParser.parse(rpn);
        System.out.println(rpn + " 运算结果为 " + result);
    }

}
