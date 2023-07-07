package com.raman.oops.innerclasses;

public class Main {
    public static void main(String[] args) {
        NestedInnerClass nestedInnerClass = new NestedInnerClass();
        // this is not mainly done because inner class is used by outer class only
        NestedInnerClass.InnerClass innerClass = new NestedInnerClass().new InnerClass();
        innerClass.innerDisplay();
        nestedInnerClass.outerDisplay2();


        StaticInnerClass.My m=new StaticInnerClass.My();
        m.show();
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.display();
        AnonymousInnerClass an = new AnonymousInnerClass();
        an.show();
    }
}
