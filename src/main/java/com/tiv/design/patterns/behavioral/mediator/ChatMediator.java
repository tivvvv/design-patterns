package com.tiv.design.patterns.behavioral.mediator;

/**
 * 中介者接口
 */
public interface ChatMediator {

    void sendMessage(User sender, String msg);

    void addUser(User user);

}
