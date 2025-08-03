package com.tiv.design.patterns.creational.builder;

public class Test {

    public static void main(String[] args) {
        Car car = new Car.builder()
                .dashboard("dashboard")
                .door("door")
                .seat("seat")
                .build();
        System.out.println(car);
    }

}
