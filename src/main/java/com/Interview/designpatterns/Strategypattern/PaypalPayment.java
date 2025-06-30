package com.Interview.designpatterns.Strategypattern;

public class PaypalPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("payment done through paypal for amount "+ amount);
    }
}
