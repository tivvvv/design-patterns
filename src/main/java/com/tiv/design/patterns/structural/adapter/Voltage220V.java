package com.tiv.design.patterns.structural.adapter;

/**
 * 220V电源(被适配者)
 */
public class Voltage220V {

    /**
     * 输出220V电压
     *
     * @return
     */
    public int output220V() {
        int voltage = 220;
        System.out.println("电源电压:" + voltage + "V");
        return voltage;
    }

}
    