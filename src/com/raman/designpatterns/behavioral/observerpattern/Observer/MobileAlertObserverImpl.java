package com.raman.designpatterns.behavioral.observerpattern.Observer;

import com.raman.designpatterns.behavioral.observerpattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "Product is in stock");
    }

    public void sendMsgOnMobile(String userName, String msg) {
        System.out.println("Msg Sent to: " + userName);
    }
}
