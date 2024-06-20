package com.raman.designpatterns.behavioral.iterator.iterator;

import com.raman.designpatterns.behavioral.iterator.aggregator.Book;

import java.util.List;

public class BookIterator implements Iterator {
    private List<Book> bookList;
    private int index = 0;

    public BookIterator(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean hasNext() {
        return index < bookList.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return this.bookList.get(index++);
        }
        return null;
    }
}
