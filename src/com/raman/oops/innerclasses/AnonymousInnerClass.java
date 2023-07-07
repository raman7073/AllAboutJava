package com.raman.oops.innerclasses;

public class AnonymousInnerClass {
    public void show() {
        Abstract ab = new Abstract() {
            @Override
            void display() {
                System.out.println("Hello from Anonymous Inner class implement abstract class");
            }
        };
        ab.display();
        // defining anonymous class which is implementing interface and it has reference of
        // interface
        Interface in = new Interface() {
            @Override
            public void display() {
                System.out.println("Hello from Anonymous Inner class implement interface");

            }
        };
        in.display();
    }

}
