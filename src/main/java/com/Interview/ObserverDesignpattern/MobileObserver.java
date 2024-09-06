package com.Interview.ObserverDesignpattern;

public class MobileObserver implements Observer{
    @Override
    public void update(String weather) {
        display(weather);
    }

    private void display(String weather){
        System.out.println("Mobile Display: updated weather : "+ weather);
    }
}
