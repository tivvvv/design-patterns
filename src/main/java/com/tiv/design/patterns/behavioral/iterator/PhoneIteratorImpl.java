package com.tiv.design.patterns.behavioral.iterator;

import java.util.List;

public class PhoneIteratorImpl implements PhoneIterator {

    private List<Phone> phoneList;

    private int index;

    private Phone phone;

    public PhoneIteratorImpl(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public Phone next() {
        System.out.println("位置" + index);
        phone = phoneList.get(index++);
        return phone;
    }

    @Override
    public boolean isLast() {
        return phoneList.size() == index;
    }

}
