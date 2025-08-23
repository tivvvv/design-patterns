package com.tiv.design.patterns.structural.bridge;

import com.tiv.design.patterns.structural.bridge.account.Account;
import com.tiv.design.patterns.structural.bridge.account.CurrentDepositAccount;
import com.tiv.design.patterns.structural.bridge.account.FixedDepositAccount;
import com.tiv.design.patterns.structural.bridge.bank.ABCBank;
import com.tiv.design.patterns.structural.bridge.bank.ICBCBank;

public class Test {

    public static void main(String[] args) {
        ICBCBank icbcBank = new ICBCBank(new CurrentDepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        ABCBank abcBank = new ABCBank(new FixedDepositAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }

}
