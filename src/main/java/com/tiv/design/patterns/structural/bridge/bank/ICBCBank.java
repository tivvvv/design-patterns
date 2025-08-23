package com.tiv.design.patterns.structural.bridge.bank;

import com.tiv.design.patterns.structural.bridge.account.Account;

/**
 * 工商银行
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开工商银行账户");
        account.openAccount();
        return account;
    }

}
