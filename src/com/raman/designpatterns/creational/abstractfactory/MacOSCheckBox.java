package com.raman.designpatterns.creational.abstractfactory;

public class MacOSCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Render a check box in macOS Style");
    }

    @Override
    public void toggle() {
        System.out.println("MacOS CheckBox Toggled");
    }
}
