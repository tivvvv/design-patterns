package com.tiv.design.patterns.structural.adapter;

/**
 * 手机
 */
public class Phone {

    /**
     * 充电,需要5V电压
     *
     * @param voltage5V
     */
    public void charge(Voltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("电压正常,可以充电");
        } else if (voltage5V.output5V() > 5) {
            System.out.println("电压过高,无法充电");
        }
    }

}
    