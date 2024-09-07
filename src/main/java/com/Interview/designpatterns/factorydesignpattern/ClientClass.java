package com.Interview.designpatterns.factorydesignpattern;

public class ClientClass {

    public void notifyUser(){
        NotificationFactory notificationFactory = new NotificationFactory();
        notificationFactory.createNotification("email").notifyUser();
        notificationFactory.createNotification("sms").notifyUser();

    }

}
