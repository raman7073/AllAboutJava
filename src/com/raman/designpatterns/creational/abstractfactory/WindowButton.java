package com.raman.designpatterns.creational.abstractfactory;

public class WindowButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Button in window Style");
    }

    @Override
    public void onClick() {
        System.out.println("Window Button clicked");
    }
}
