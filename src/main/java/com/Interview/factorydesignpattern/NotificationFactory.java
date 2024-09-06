package com.Interview.factorydesignpattern;

public class NotificationFactory {
    public NotificationFactory() {
    }
    public Notification createNotification(String notificationType){
        if(notificationType.equalsIgnoreCase("email"))
            return new EmailNotification();
        else if(notificationType.equalsIgnoreCase("sms"))
            return new SmsNotification();
        else
            return null;
    }

}
