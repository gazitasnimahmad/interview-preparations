package com.Interview.designpatterns.Strategypattern;

public class MainClass {
    public static void main(String[] args){
        PaymentStrategy paymentStrategy = new PaymentPayment();
        ShoppingCart shoppingCart = new ShoppingCart(paymentStrategy);
        shoppingCart.checkout(500);
    }
}
