package com.raman.designpatterns.interview.monarchy;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public String name;
    public boolean isAlive;
    List<Person> child;

    public Person(String name) {
        this.name = name;
        this.isAlive = true;
        this.child = new ArrayList<>();
    }
}
