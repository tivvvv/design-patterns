package com.tiv.design.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class PhoneAggregateImpl implements PhoneAggregate {

    private List<Phone> phoneList;

    public PhoneAggregateImpl() {
        phoneList = new ArrayList<>();
    }

    @Override
    public void add(Phone phone) {
        this.phoneList.add(phone);
    }

    @Override
    public void remove(Phone phone) {
        this.phoneList.remove(phone);
    }

    @Override
    public PhoneIterator iterator() {
        return new PhoneIteratorImpl(phoneList);
    }

}
