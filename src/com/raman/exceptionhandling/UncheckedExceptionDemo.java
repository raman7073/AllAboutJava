package com.raman.exceptionhandling;

public class UncheckedExceptionDemo extends RuntimeException{
    @Override
    public String toString() {
        return "checking run time exception";
    }
}
