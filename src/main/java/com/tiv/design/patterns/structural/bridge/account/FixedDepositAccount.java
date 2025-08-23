package com.tiv.design.patterns.structural.bridge.account;

/**
 * 定期存款账户
 */
public class FixedDepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开定期存款账户");
        return new FixedDepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期存款账户");
    }

}
