package com.tiv.design.patterns.creational.prototype;

import java.util.Date;

public class Mail extends AbstractMail {

    private String address;

    private String content;

    private Date date;

    public Mail(String address, String content, Date date) {
        this.address = address;
        this.content = content;
        this.date = date;
        System.out.println("调用Mail构造器,耗时很长");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "address='" + address + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                " " + super.toString() +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mail mail = (Mail) super.clone();
        // 深拷贝
        mail.date = (Date) mail.date.clone();
        return mail;
    }

}