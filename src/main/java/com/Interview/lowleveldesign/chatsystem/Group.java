package com.Interview.lowleveldesign.chatsystem;

import java.util.List;

public class Group extends Chat{
    private String groupId;
    private String groupName;
    private List<User> admins;


    public Group(List<Message> messages, List<User> participants, String chatType, String chatId, String groupId, String groupName, List<User> admins) {
        super(participants, chatType, chatId);
        this.admins=admins;
        this.groupId = groupId;
        this.groupName = groupName;
    }

    public void addAdmin(User user){
        admins.add(user);
    }

    public void createGroup(User creator){
        admins.add(creator);
    }
}
