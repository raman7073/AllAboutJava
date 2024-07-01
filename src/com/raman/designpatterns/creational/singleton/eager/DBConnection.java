package com.raman.designpatterns.creational.singleton.eager;

public class DBConnection {
    // eager initialisation at time of class loading
    private static DBConnection conObject = new DBConnection();

    // private constructor
    private DBConnection() {
    }

    public static DBConnection getInstance() {
        return conObject;
    }

}
