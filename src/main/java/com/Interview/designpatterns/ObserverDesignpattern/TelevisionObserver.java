package com.Interview.designpatterns.ObserverDesignpattern;

public class TelevisionObserver implements Observer{
    @Override
    public void update(String weather) {
        display(weather);
    }

    private void display(String weather){
        System.out.println("Television Display: updated weather : "+ weather);
    }
}
