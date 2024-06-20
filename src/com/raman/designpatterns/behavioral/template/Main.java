package com.raman.designpatterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        PaymentFlow obj = new PayToFriend();
        obj.sendMoney();
    }
}
