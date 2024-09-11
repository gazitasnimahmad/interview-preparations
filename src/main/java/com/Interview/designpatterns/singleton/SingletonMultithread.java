package com.Interview.designpatterns.singleton;
//this can be a solution, but it can lead to performance degradation in multithreading environemnt,
//as multiple threads cant have access to synchronized block at the same time.

//public class SingletonMultithread {
//
//    public static SingletonMultithread singletonMultithread;
//
//    private SingletonMultithread(){
//
//    }
//
//    public static synchronized SingletonMultithread getInstance(){
//        if(singletonMultithread == null)
//            return new SingletonMultithread();
//        return singletonMultithread;
//    }
//}

//below is a little more improved desing

public class SingletonMultithread {
    private static volatile SingletonMultithread singletonMultithread;
    private SingletonMultithread(){
    }

    public static SingletonMultithread getInstance(){
        if(singletonMultithread == null){
            synchronized (SingletonMultithread.class){
                if(singletonMultithread == null){
                    return new SingletonMultithread();

                }
            }
        }

        return singletonMultithread;
    }

    //The volatile keyword in Java is used to ensure visibility of changes to variables across multiple threads.
    // It is primarily used in multithreading environments to prevent threads from caching variables
    // and to ensure that the value of a volatile variable is always read from the main memory,
    // not from the thread's local cache. This guarantees that changes made by one thread are
    // visible to other threads immediately.
}