package com.tiv.design.patterns.creational.prototype;

public class MailUtil {

    public static void sendMail(Mail mail) {
        System.out.printf("在 %s 向 %s 发送邮件,内容: %s%n", mail.getDate(), mail.getAddress(), mail.getContent());
    }

    public static void saveOriginalMail(Mail mail) {
        System.out.printf("存储初始mail: %s%n", mail.toString());
    }

}