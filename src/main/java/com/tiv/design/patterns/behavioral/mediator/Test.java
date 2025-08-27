package com.tiv.design.patterns.behavioral.mediator;

public class Test {

    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new User(chatRoom, "张三");
        User user2 = new User(chatRoom, "李四");
        User user3 = new User(chatRoom, "王五");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("大家好");
        System.out.println();
        user3.send("你好呀");
    }

}
