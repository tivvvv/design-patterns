package com.tiv.design.patterns.structural.adapter;

/**
 * 电源适配器
 */
public class VoltageAdapter implements Voltage5V {
    // 持有被适配对象的引用
    private Voltage220V voltage220V;
    
    // 通过构造器传入被适配对象
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int output = 0;
        if (voltage220V != null) {
            // 变压器
            int voltage = voltage220V.output220V();
            output = voltage / 44;
            System.out.println("通过适配器转换后输出电压:" + output + "V");
        }
        return output;
    }

}
    