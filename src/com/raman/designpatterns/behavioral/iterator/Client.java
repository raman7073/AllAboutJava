package com.raman.designpatterns.behavioral.iterator;

import com.raman.designpatterns.behavioral.iterator.aggregator.Book;
import com.raman.designpatterns.behavioral.iterator.aggregator.Library;
import com.raman.designpatterns.behavioral.iterator.iterator.Iterator;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book(50, "Science"),
                new Book(20, "literature"),
                new Book(3, "GK"),
                new Book(45, "Philosophy")
        );
        Library lib = new Library(bookList);
        Iterator itr = lib.createIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
    }
}
