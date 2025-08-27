package com.tiv.design.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者实现类
 */
public class ChatRoom implements ChatMediator {

    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(User sender, String msg) {
        for (User user : users) {
            if (user != sender) {
                user.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

}
