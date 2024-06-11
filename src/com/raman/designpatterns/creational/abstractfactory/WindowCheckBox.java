package com.raman.designpatterns.creational.abstractfactory;

public class WindowCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Render a check box in Window Style");
    }

    @Override
    public void toggle() {
        System.out.println("Window CheckBox Toggled");
    }
}
