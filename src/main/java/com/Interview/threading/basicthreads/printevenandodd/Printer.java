package com.Interview.threading.basicthreads.printevenandodd;

public class Printer {
    private final int limit ;
    private volatile boolean odd = true;

    public Printer(int limit) {
        this.limit = limit;
    }

    public synchronized void printEven() throws InterruptedException {
        for(int i=2;i<limit;i += 2){
            if(odd){
                wait();
            }
            System.out.println("Even: "+i);
                odd = true;
                notify();
            }
        }



    public synchronized void printOdd() throws InterruptedException {
        for(int i=1;i<limit;i +=2){
            if(!odd){
                wait();
            }
            System.out.println("Odd: "+i);

            odd = false;
                notify();
            }
        }

    }

