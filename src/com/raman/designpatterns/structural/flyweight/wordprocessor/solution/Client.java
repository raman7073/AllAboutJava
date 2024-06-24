package com.raman.designpatterns.structural.flyweight.wordprocessor.solution;

public class Client {
    public static void main(String[] args) {
        Letter ob = LetterFactory.createLetter('t');
        ob.display(0, 0);
        Letter ob1 = LetterFactory.createLetter('h');
        ob1.display(0, 1);
        Letter ob2 = LetterFactory.createLetter('i');
        ob2.display(0, 2);
        Letter ob3 = LetterFactory.createLetter('s');
        ob3.display(0, 4);

        ob2.display(0, 6);
        ob3.display(0, 7);


    }
}
