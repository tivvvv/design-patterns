package com.tiv.design.patterns.structural.bridge.account;

/**
 * 活期存款账户
 */
public class CurrentDepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开活期存款账户");
        return new CurrentDepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期存款账户");
    }

}
