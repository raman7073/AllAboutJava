package com.raman.designpatterns.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------Render UI Windows-------------------");
        renderUI(new WindowFactory());
        System.out.println("------------------Render UI MacOS-------------------");
        renderUI(new MacOSFactory());

    }

    public static void renderUI(GUIFactory factory) {
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox(button);
        button.render();
        checkBox.render();
        button.onClick();
        checkBox.toggle();

    }
}
