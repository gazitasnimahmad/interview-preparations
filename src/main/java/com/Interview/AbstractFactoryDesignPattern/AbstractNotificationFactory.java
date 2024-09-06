package com.Interview.AbstractFactoryDesignPattern;

public interface AbstractNotificationFactory {
    public EmailNotification createEmailNotificationOs();
    public SmsNotification createSmsNotificationOs();
}
