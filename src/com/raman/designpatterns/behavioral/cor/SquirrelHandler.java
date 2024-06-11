package com.raman.designpatterns.behavioral.cor;

public class SquirrelHandler extends AbstractHandler {
    public String handle(String request) {
        if (request == "Nut") {
            return "Squirrel eat Nut";
        } else {
            return super.handle(request);
        }
    }
}
