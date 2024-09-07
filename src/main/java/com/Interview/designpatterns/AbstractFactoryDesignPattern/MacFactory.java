package com.Interview.designpatterns.AbstractFactoryDesignPattern;

public class MacFactory implements AbstractNotificationFactory{
    @Override
    public EmailNotification createEmailNotificationOs() {
        return new MacEmailNotification();

    }

    @Override
    public SmsNotification createSmsNotificationOs() {
        return new MacSmsNotification();
    }
}
