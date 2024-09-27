package com.Interview.algorithms.recursion;

public class factorials {

    public static void main(String[] args){
        int num = 6;
        System.out.println(factorial(num));
    }

    private static int factorial(int i) {
        if(i==1)
            return i;
        return i*factorial(i-1);
    }
}
