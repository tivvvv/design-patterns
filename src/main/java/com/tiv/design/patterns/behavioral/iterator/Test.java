package com.tiv.design.patterns.behavioral.iterator;

public class Test {

    public static void main(String[] args) {
        Phone apple = new Phone("苹果");
        Phone xiaomi = new Phone("小米");
        Phone oppo = new Phone("oppo");
        Phone vivo = new Phone("vivo");

        PhoneAggregate phoneAggregate = new PhoneAggregateImpl();
        phoneAggregate.add(apple);
        phoneAggregate.add(xiaomi);
        phoneAggregate.add(oppo);
        phoneAggregate.add(vivo);

        print(phoneAggregate);

        System.out.println("----------");
        phoneAggregate.remove(xiaomi);
        print(phoneAggregate);
    }

    private static void print(PhoneAggregate phoneAggregate) {
        PhoneIterator iterator = phoneAggregate.iterator();
        while (!iterator.isLast()) {
            Phone phone = iterator.next();
            System.out.println(phone.getName());
        }
    }


}
