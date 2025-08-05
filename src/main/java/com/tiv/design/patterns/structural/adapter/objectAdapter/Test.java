package com.tiv.design.patterns.structural.adapter.objectAdapter;

public class Test {

    public static void main(String[] args) {
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }

}
