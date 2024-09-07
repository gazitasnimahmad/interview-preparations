package com.Interview.lowleveldesign.chatsystem;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private List<Message> messages;
    private List<User> participants;
    private String chatType;
    private String chatId;

    public Chat(List<User> participants, String chatType, String chatId) {
        this.messages = new ArrayList<>();
        this.participants = participants;
        this.chatType = chatType;
        this.chatId = chatId;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void addMessage(Message message){
        messages.add(message);
    }

    public void addUser(User user){
        this.participants.add(user);
    }

    public void removeUser(User user){
        this.participants.remove(user);
    }

    public List<Message> getChatHistory(List<Message> chatHistory){
        return this.messages;
    }

}
