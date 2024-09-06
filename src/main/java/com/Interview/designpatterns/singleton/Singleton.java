package com.Interview.designpatterns.singleton;

public class Singleton {
    private static Singleton dbObject;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(dbObject == null)
            return new Singleton();
        return dbObject;
    }

}

