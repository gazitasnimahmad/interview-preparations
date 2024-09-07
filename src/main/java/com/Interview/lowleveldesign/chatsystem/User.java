package com.Interview.lowleveldesign.chatsystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

    private String userId;
    private String userName;
    private String phoneNumber;
    private Date lastSeen;
    private List<User> contact = new ArrayList<>();
    private String status;

    public User(String userId, String userName, String phoneNumber, Date lastSeen, String status, List<User> contact){
        this.userId=userId;
        this.userName= userName;
        this.phoneNumber = phoneNumber;
        this.lastSeen=lastSeen;
        this.contact = contact;
        this.status = status;
    }

    public void addUser(User user){
        this.contact.add(user);
    }

    public void remove(User user){
        this.contact.remove(user);
    }

    public void sendMessage(Message message, Chat chat){
        chat.addMessage(message);
    }

    public void receiveMessage(Message message){
        System.out.println("Message received: "+ message.getContent());
    }

}
