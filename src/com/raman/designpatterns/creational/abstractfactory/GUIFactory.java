package com.raman.designpatterns.creational.abstractfactory;

public interface GUIFactory {
    public Button createButton();

    public CheckBox createCheckBox(Button button);
}
