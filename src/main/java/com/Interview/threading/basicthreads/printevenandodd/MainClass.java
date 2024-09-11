package com.Interview.threading.basicthreads.printevenandodd;

import com.Interview.threading.basicthreads.ThreadRunnable;

public class MainClass {
    public static  void main(String[] args){
//        print even number by one thread and odd by other thread

        Printer printer = new Printer(20);

        Thread evenThread = new Thread(() -> {
            try {
                printer.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread oddThread = new Thread(() -> {
            try {
                printer.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        oddThread.start();
        evenThread.start();



    }
}
