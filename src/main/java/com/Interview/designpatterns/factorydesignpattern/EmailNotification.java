package com.Interview.designpatterns.factorydesignpattern;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Notification done through Email.");
    }
}
