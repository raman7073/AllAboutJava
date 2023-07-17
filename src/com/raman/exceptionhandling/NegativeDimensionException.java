package com.raman.exceptionhandling;

public class NegativeDimensionException extends Exception {
    @Override
    public String toString() {
        return "Dimensions of a Rectangle cannot be Negative";
    }
}
