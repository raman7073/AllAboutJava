package com.raman.designpatterns.behavioral.iterator.aggregator;

import com.raman.designpatterns.behavioral.iterator.iterator.Iterator;

public interface Aggregate {
    Iterator createIterator();
}
