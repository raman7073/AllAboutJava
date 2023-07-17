package com.raman.exceptionhandling;

public class FinallyDemo {
    static void meth1()
    {
        try
        {

            throw new Exception();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally
        {
            //this message will definitely execute
            System.out.println("Final Message");
        }

    }

    public static void main(String[] args)
    {
        meth1();
    }
}
