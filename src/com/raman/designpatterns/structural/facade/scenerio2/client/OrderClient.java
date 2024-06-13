package com.raman.designpatterns.structural.facade.scenerio2.client;

import com.raman.designpatterns.structural.facade.scenerio2.facadelayer.OrderFacade;

public class OrderClient {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();
    }
}
// there may be multiple facade ,when there is complex system
//a facade may be using other facade
/*

 adapter vs facade
 adapter is there to bring compatibility between adaptee(original interface) and client
 facade is there to hide complexity.

 proxy vs facade
 proxy is just for a particular object.proxy just take care of actual object .proxy and actual object
 implements same interface.

 */