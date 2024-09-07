package com.Interview.lowleveldesign.chatsystem;


import java.util.Date;

public class Message {
    private String content;
    private String messageId;
    private User sender;
    private Date timeStamp;
    private String contentType;

    private DeliveryStatus deliveryStatus;

    public Message(String content, String messageId, User sender, Date timeStamp) {
        this.content = content;
        this.messageId = messageId;
        this.sender = sender;
        this.timeStamp = timeStamp;
        this.deliveryStatus = deliveryStatus.SENT;
    }

    public String getContent(){
        return content;
    }

    public DeliveryStatus getDeliveryStatus(){
        return deliveryStatus;
    }

    public void updateDeliveryStatus(DeliveryStatus deliveryStatus){
        this.deliveryStatus= deliveryStatus;
    }
}
