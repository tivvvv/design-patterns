package com.tiv.design.patterns.structural.bridge.bank;

import com.tiv.design.patterns.structural.bridge.account.Account;

/**
 * 银行
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract public Account openAccount();

}
