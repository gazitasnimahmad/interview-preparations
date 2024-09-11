package com.Interview.oops.encapsulation;

public class encapsulation {

//    Encapsulation refers to the practice of bundling the data (variables) and methods (functions)
//    that operate on the data into a single unit, usually a class,

//    Benefits of Encapsulation:
//    Data Hiding: It hides the internal state of the object and only exposes operations.
//    Security: Sensitive information can be protected by allowing only controlled access.
//    Code Maintainability: Changes to internal implementations do not affect other parts of the codebase as long as the public interface remains unchanged.
//    Flexibility: The class can change its internal logic without affecting the external code, allowing easier updates or bug fixes.

    private int accountNumber;
    private int balance;

    public encapsulation(int balance,int accountNumber){
        this.accountNumber =accountNumber;
        this.balance=balance;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0)
            balance += amount;
        else
            System.out.println("invalid amount");
    }

    public void withdraw(int amount){
        if(amount > 0 && amount <balance)
            amount = balance - amount;
        else
            System.out.println("invalid amount");
    }
}
