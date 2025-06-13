package com.Interview.designpatterns.Strategypattern;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("payment done through cash for amount "+ amount);
    }
}
