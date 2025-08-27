package com.tiv.design.patterns.behavioral.mediator;

public class User {

    private ChatMediator mediator;

    private String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void send(String message) {
        System.out.println(name + " 发送消息: " + message);
        mediator.sendMessage(this, message);
    }

    public void receive(String message) {
        System.out.println(name + " 收到消息: " + message);
    }

    public ChatMediator getMediator() {
        return mediator;
    }

    public void setMediator(ChatMediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
