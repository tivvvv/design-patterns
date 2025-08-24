package com.tiv.design.patterns.creational.prototype;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail("初始地址", "初始内容", new Date(0L));
        System.out.println("初始模版:" + mail);
        for (int i = 0; i < 3; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setAddress("地址" + i);
            mailTemp.setContent("内容" + i);
            mailTemp.getDate().setTime(1111111111111L);
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginalMail(mail);
    }

}