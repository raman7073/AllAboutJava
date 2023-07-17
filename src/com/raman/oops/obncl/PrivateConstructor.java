package com.raman.oops.obncl;

public class PrivateConstructor {

    private static PrivateConstructor privateConstructor;

    private PrivateConstructor() {

    }

    public static PrivateConstructor getInstance() {
        /**
         *  we can't use non-static field in static context
         */
        if (privateConstructor == null) {
            privateConstructor = new PrivateConstructor();
        }
        return privateConstructor;
    }
}
