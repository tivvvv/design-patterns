package com.tiv.design.patterns.behavioral.iterator;

public interface PhoneAggregate {

    void add(Phone phone);

    void remove(Phone phone);

    PhoneIterator iterator();

}
