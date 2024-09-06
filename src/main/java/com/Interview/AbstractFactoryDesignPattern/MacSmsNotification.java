package com.Interview.AbstractFactoryDesignPattern;

public class MacSmsNotification implements SmsNotification{
    @Override
    public void createSmsNotification(String message) {
        System.out.println(message + "mac");
    }
}
