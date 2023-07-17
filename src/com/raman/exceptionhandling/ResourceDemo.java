package com.raman.exceptionhandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class ResourceDemo {
    static void Divide() throws Exception {

        //auto close of resources
        try (FileInputStream fi = new FileInputStream("Test.txt");
             Scanner sc = new Scanner(fi)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / c);
        }

    }

    public static void main(String[] args) throws Exception {
        try {
            Divide();
        } catch (Exception e) {
            System.out.println(e);
        }

        //int x=sc.nextInt();

        // System.out.println(x);

    }
}
