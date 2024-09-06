package com.Interview.AbstractFactoryDesignPattern;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        AbstractNotificationFactory notificationFactory;
        System.out.println("input the os name");
        Scanner scanner = new Scanner(System.in);

        String platForm = scanner.next();

        if(platForm.equals("windows")){
            notificationFactory = new WidowsFactory();
        } else {
            notificationFactory = new MacFactory();
        }

        EmailNotification email =  notificationFactory.createEmailNotificationOs();
        SmsNotification sms = notificationFactory.createSmsNotificationOs();

        email.createEmailNotification("Hello email from ");
        sms.createSmsNotification("Hello sms from ");

    }

}
