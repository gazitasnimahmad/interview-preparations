package com.Interview.lowleveldesign.chatsystem;

public class Notification {
    private String notificationId;
    private User user;
    private NotificationType type;

    public Notification(String notificationId, User user, NotificationType type) {
        this.notificationId = notificationId;
        this.user = user;
        this.type = type;
    }

    public void sendNotification(User user){
        System.out.println("Notifcation sent to : " + user);
    }

}
