package com.Interview.designpatterns.AbstractFactoryDesignPattern;

public class WidowsFactory implements AbstractNotificationFactory {

    @Override
    public EmailNotification createEmailNotificationOs() {
        return new WindowsEmailNotification();
    }

    @Override
    public SmsNotification createSmsNotificationOs() {
        return new WindowSmsNotification();
    }

}
