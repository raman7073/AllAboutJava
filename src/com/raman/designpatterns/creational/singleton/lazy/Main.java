package com.raman.designpatterns.creational.singleton.lazy;


public class Main {
    public static void main(String[] args) {
        DBConnection object = DBConnection.getInstance();
    }
}
/*
  problem is when two threads comes simultaneously to getInstance()
  ,it may happen that there are more than one objects get created.

 */