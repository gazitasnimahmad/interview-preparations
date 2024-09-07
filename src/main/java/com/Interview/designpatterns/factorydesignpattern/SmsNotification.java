package com.Interview.designpatterns.factorydesignpattern;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notification done through sms");
    }
}
