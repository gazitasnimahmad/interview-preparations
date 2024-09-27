package com.Interview.designpatterns.factorydesignpattern;

public class ClientClass {

    //One of the main advantages of the Factory pattern is that it encapsulates the logic of object creation,
    // hiding the complexities involved. This allows clients to work with higher-level abstractions
    // without worrying about how objects are created or their concrete types.

    //Benefit: The client code doesn’t need to change when object creation logic changes, as the Factory handles
    // that behind the scenes.
    //Example: If a certain object requires complex initialization or parameters, the Factory method hides
    // these details, making object creation easier for the client.

    public void notifyUser(){
        NotificationFactory notificationFactory = new NotificationFactory();
        notificationFactory.createNotification("email").notifyUser();
        notificationFactory.createNotification("sms").notifyUser();

    }

}
