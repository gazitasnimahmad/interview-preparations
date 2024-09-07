package com.Interview.lowleveldesign.chatsystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainClass {
    public static void main(String[] args){
        User tasnim = new User("101","tasnim","902131221",new Date(),"online", new ArrayList<>());
        User deep = new User("102","deep","43555221",new Date(),"online", new ArrayList<>());
        User abhishek = new User("103","abishek","64352553",new Date(),"offline", new ArrayList<>());
        User ayush = new User("104","ayush","675723566",new Date(),"online", new ArrayList<>());

        Message message1 = new Message("Hi how r u","m101",tasnim,new Date());
        Message message2 = new Message("how is your class going","m102",tasnim,new Date());


        Chat chat = new Chat(List.of(tasnim,ayush),"private","c101");
        tasnim.sendMessage(message1,chat);
        tasnim.sendMessage(message2,chat);

        ayush.receiveMessage(chat.getMessages().get(chat.getMessages().size()-1));

    }
}
