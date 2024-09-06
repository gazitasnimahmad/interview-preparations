package com.Interview.AbstractFactoryDesignPattern;

public class MacEmailNotification implements EmailNotification{
    @Override
    public void createEmailNotification(String message) {
        System.out.println(message + "mac");

    }
}
