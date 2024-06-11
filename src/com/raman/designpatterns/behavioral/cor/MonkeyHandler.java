package com.raman.designpatterns.behavioral.cor;

public class MonkeyHandler extends AbstractHandler {
    public String handle(String request) {
        if (request == "Banana") {
            return "Monkey eat Banana";
        } else {
            return super.handle(request);
        }
    }
}
