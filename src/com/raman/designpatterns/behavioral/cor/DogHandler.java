package com.raman.designpatterns.behavioral.cor;

public class DogHandler extends AbstractHandler {
    public String handle(String request) {
        if (request == "MeatBall") {
            return "Dog eat MeatBall";
        } else {
            return super.handle(request);
        }
    }
}
