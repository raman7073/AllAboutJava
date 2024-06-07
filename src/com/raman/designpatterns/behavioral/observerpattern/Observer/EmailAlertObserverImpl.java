package com.raman.designpatterns.behavioral.observerpattern.Observer;

import com.raman.designpatterns.behavioral.observerpattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product is back in stock");
    }

    public void sendEmail(String emailId, String msg) {
        System.out.println("Mail sent t0:" + emailId);

    }
}
