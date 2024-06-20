package com.raman.designpatterns.behavioral.template;

public class PayToMerchant extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validate logic pay to merchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("calculate logic pay to merchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit logic pay to merchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit logic pay to merchant");
    }
}
