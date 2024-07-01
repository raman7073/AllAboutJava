package com.raman.designpatterns.creational.prototype.issue;

public class Client {

    /*
      It is used when we have to make Copy/Clone from existing object.

     */

    public static void main(String[] args) {
        Student obj = new Student(29, 78, "Tapper");

        //creating clone
        Student cloneObj = new Student();
        cloneObj.age = obj.age;
        cloneObj.rollNumber = obj.rollNumber;
        cloneObj.name = obj.name;
    }
}
/*
  The issue here is by this way you can't clone private members.
  Client has to know everything about original object.

 */