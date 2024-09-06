package com.Interview.oops.polymorphism;

public class RunTimePolymorrphism {

    // method to be executed is determined during the runtime, not at compile-time.
    // It is achieved through method overriding, where a subclass provides a specific implementation
    // of a method that is already defined in its superclass.

    //Key Features of Run-Time Polymorphism:
    //Method Overriding: It allows a subclass to provide a specific implementation for a method that is
    // already defined in its superclass.

    //Inheritance: Run-time polymorphism relies on inheritance and the subclass's ability to override
    // methods from the parent class.

    //Dynamic Binding: The method to be executed is determined during the program’s execution based on
    // the object type (even if the reference is of the parent class).

    //Upcasting: In run-time polymorphism, the superclass reference variable can refer to an object of a
    // subclass, but at runtime, the subclass's method is executed.
}


//public class Payment {
//    public void processPayment(double amount) {
//        System.out.println("Processing generic payment of $" + amount);
//    }
//}

// Subclass CreditCardPayment
//public class CreditCardPayment extends Payment {
//    @Override
//    public void processPayment(double amount) {
//        System.out.println("Processing credit card payment of $" + amount);
//    }
//}
//

// Subclass PayPalPayment
//public class PayPalPayment extends Payment {
//    @Override
//    public void processPayment(double amount) {
//        System.out.println("Processing PayPal payment of $" + amount);
//    }
//}