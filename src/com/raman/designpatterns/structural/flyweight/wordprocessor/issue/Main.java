package com.raman.designpatterns.structural.flyweight.wordprocessor.issue;

import com.raman.designpatterns.structural.flyweight.wordprocessor.issue.Character;

public class Main {
    /*

       this is the data you want to write into the word processor.
       total = 58 char
       t = 7 times
       h = 3 times ...
       solution:
       all t will look like same.we can use flyweight
     */
    public static void main(String[] args) {
        Character ob = new Character('t', "Arial", 10, 0, 1);
        Character ob1 = new Character('h', "Arial", 10, 0, 2);
        Character ob2 = new Character('i', "Arial", 10, 0, 3);
        Character ob3 = new Character('s', "Arial", 10, 0, 4);
    }
}
