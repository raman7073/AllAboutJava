package com.raman.designpatterns.creational.abstractfactory;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox(Button button) {
        return new MacOSCheckBox();
    }
}
