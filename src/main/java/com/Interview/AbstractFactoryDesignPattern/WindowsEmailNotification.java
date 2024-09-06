package com.Interview.AbstractFactoryDesignPattern;

public class WindowsEmailNotification implements EmailNotification {
    @Override
    public void createEmailNotification(String message) {
        System.out.println(message + "windows");
    }
}
