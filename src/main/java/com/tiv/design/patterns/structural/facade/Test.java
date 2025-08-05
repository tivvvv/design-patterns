package com.tiv.design.patterns.structural.facade;

public class Test {

    public static void main(String[] args) {
        Product iphone = new Product("iphone");
        ShoppingFacade shoppingFacade = new ShoppingFacade();
        shoppingFacade.buy(iphone);
    }

}
