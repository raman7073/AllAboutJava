package com.raman.designpatterns.behavioral.template;

public abstract class PaymentFlow {
    public abstract void validateRequest();

    public abstract void calculateFees();

    public abstract void debitAmount();

    public abstract void creditAmount();

    //can't be over-ride but are available to use in child class
    //this is Template Method which defines the order of steps to execute the
    //task
    public final void sendMoney() {
        //step 1
        validateRequest();
        //step 2
        debitAmount();
        //step 3
        calculateFees();
        //step 4
        creditAmount();
    }
}
