package com.raman.designpatterns.behavioral.cor;

public interface Handler {
    public Handler setNextHandler(Handler handler);

    public String handle(String request);
}
