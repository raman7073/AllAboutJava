package com.raman.designpatterns.creational.abstractfactory;

public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Button in macOS Style");
    }

    @Override
    public void onClick() {
        System.out.println("macOS CheckBox Toggled");
    }
}
