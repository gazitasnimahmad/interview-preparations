package com.Interview.threading.basicthreads;

public class MainClass {
    public static  void main(String[] args){
//        MyThread mythread = new MyThread();
//        mythread.start();

//        ThreadUsingRunnable threadUsingRunnable = new ThreadUsingRunnable();
//        Thread thread = new Thread(threadUsingRunnable);
//        thread.start();

        for (int i =0; i <11;i++){
            ThreadRunnable threadRunnable = new ThreadRunnable(i);
            Thread thread = new Thread(threadRunnable);
            thread.start();
        }

    }
}
