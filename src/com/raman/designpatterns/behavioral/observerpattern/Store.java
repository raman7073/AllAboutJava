package com.raman.designpatterns.behavioral.observerpattern;

import com.raman.designpatterns.behavioral.observerpattern.Observable.IphoneObservableImpl;
import com.raman.designpatterns.behavioral.observerpattern.Observable.StocksObservable;
import com.raman.designpatterns.behavioral.observerpattern.Observer.EmailAlertObserverImpl;
import com.raman.designpatterns.behavioral.observerpattern.Observer.MobileAlertObserverImpl;
import com.raman.designpatterns.behavioral.observerpattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("xyz2@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3= new MobileAlertObserverImpl("xyz__",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
