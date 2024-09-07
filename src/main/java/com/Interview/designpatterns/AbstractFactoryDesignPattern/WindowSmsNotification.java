package com.Interview.designpatterns.AbstractFactoryDesignPattern;

public class WindowSmsNotification implements SmsNotification{
    @Override
    public void createSmsNotification(String message) {
        System.out.println(message + "windows");

    }
}
