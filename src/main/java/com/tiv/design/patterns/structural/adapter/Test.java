package com.tiv.design.patterns.structural.adapter;

public class Test {

    public static void main(String[] args) {
        // 220V电源,被适配者
        Voltage220V voltage220V = new Voltage220V();
        // 适配器
        VoltageAdapter adapter = new VoltageAdapter(voltage220V);

        Phone phone = new Phone();
        phone.charge(adapter);
    }

}
    