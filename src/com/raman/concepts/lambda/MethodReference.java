package com.raman.concepts.lambda;

/**
 * Method reference is used to refer method of functional interface or interface with single method.We can
 * dynamically assign any method to reference of functional interface or interface with single method.
 */
public class MethodReference {
    public static void reverse(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public void reverse1(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}
