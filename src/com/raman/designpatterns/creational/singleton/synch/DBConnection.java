package com.raman.designpatterns.creational.singleton.synch;

public class DBConnection {
    private static DBConnection conObject;

    private DBConnection() {
    }

    synchronized public static DBConnection getInstance() {
        if (conObject == null) {
            conObject = new DBConnection();
        }
        return conObject;
    }

}
/*
   Single locking
   it is expensive , everytime this method is invoked we have to put lock and when
   n number of threads comes simultaneously , it is an expensive operation .
 */