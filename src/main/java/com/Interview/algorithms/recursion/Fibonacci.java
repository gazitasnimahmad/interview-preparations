package com.Interview.algorithms.recursion;

public class Fibonacci {

    public static void main(String[] args){
        int num = 5;
        System.out.println(fibonacci(num));
    }

    private static int fibonacci(int num) {
        if(num ==0 )
            return 0;
        if(num==1)
            return 1;

        return fibonacci(num-1)+fibonacci(num-2);
    }
}
