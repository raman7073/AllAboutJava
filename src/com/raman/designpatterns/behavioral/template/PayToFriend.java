package com.raman.designpatterns.behavioral.template;

public class PayToFriend extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validate logic of pay to friend");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculate logic of pay to friend");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit logic of pay to friend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit logic of pay to friend");
    }
}
