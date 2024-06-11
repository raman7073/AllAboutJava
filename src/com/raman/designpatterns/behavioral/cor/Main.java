package com.raman.designpatterns.behavioral.cor;

public class Main {
    public static void clientCode(Handler handler) {
        String[] foods = new String[3];
        foods[0] = "Nut";
        foods[1] = "Banana";
        foods[2] = "Meat";
        for (String food : foods) {
            System.out.println("Client : Who wants a " + food + " ?");
            String result = handler.handle(food);
            if (result != null) {
                System.out.println(result);
            } else {
                System.out.println(food + " was left untouched");
            }
        }
    }

    public static void main(String[] args) {
        Handler handler1 = new MonkeyHandler();
        Handler handler2 = new SquirrelHandler();
        Handler handler3 = new DogHandler();
        handler3.setNextHandler(handler1).setNextHandler(handler2);
        clientCode(handler3);
    }
}
