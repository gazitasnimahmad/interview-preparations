package com.Interview.lowleveldesign.designpatternspractice.singleton;

import com.Interview.designpatterns.singleton.Singleton;

public class singleton {

    public static volatile Singleton singleton;

    private void Singleton() {}

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null)
                    return new Singleton();
            }
        }
        return singleton;
    }
}
