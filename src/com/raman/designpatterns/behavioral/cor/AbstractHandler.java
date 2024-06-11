package com.raman.designpatterns.behavioral.cor;

public abstract class AbstractHandler implements Handler {
    private Handler nextHandler = null;

    public Handler setNextHandler(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    public String handle(String request) {
        if (this.nextHandler != null) {
            return this.nextHandler.handle(request);
        }
        return null;
    }

}
