package com.raman.designpatterns.creational.prototype.solution;

public class Client {
    public static void main(String[] args) {
        Student obj = new Student(23, "Ram", 75);
        Student cloneObj = (Student) obj.clone();
        System.out.println(obj);
        System.out.println(cloneObj);
    }
}
