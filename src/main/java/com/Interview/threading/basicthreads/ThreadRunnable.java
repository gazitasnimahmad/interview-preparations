package com.Interview.threading.basicthreads;

public class ThreadRunnable implements Runnable{
    private int message;

    public ThreadRunnable(int message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}
