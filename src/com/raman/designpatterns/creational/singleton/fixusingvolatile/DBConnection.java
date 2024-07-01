package com.raman.designpatterns.creational.singleton.fixusingvolatile;

public class DBConnection {
    private static volatile DBConnection conObject;
    int memberVariable;

    private DBConnection(int memberVariable) {
        this.memberVariable = memberVariable;
    }

    public static DBConnection getInstance() {
        if (conObject == null) {
            synchronized (com.raman.designpatterns.creational.singleton.doublelocking.DBConnection.class) {
                if (conObject == null) {
                    conObject = new DBConnection(10);
                }
            }
        }
        return conObject;
    }

}
