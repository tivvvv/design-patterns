package com.tiv.design.patterns.structural.bridge.bank;

import com.tiv.design.patterns.structural.bridge.account.Account;

/**
 * 农业银行
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开农业银行账户");
        account.openAccount();
        return account;
    }

}
