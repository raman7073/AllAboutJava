package com.raman.designpatterns.behavioral.iterator.aggregator;

import com.raman.designpatterns.behavioral.iterator.iterator.BookIterator;
import com.raman.designpatterns.behavioral.iterator.iterator.Iterator;

import java.util.List;

public class Library implements Aggregate {
    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(bookList);
    }
}
