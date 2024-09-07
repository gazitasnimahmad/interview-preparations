package com.Interview.designpatterns.AbstractFactoryDesignPattern;

public interface AbstractNotificationFactory {
    public EmailNotification createEmailNotificationOs();
    public SmsNotification createSmsNotificationOs();
}
