package com.raman.designpatterns.creational.abstractfactory;

public class WindowFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBox(Button button) {
        return new WindowCheckBox();
    }
}
