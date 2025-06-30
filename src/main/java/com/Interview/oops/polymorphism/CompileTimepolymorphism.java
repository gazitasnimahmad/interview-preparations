package com.Interview.oops.polymorphism;

public class CompileTimepolymorphism {

    //Key Features of Compile-time Polymorphism:
    //Method Overloading: Multiple methods in the same class can have the same name but with different
    // parameter types, numbers, or order of parameters.

    //No Inheritance Needed: Compile-time polymorphism does not require a class hierarchy like
    // run-time polymorphism. The methods are simply overloaded in the same class.

    //Resolved During Compilation: The Java compiler determines which method to invoke
    // based on the method signature (method name, parameter type, and number of arguments) during compilation.

}



//    public class Calculator {
//        // Overloaded add method for two integers
//        public int add(int a, int b) {
//            return a + b;
//        }
//
//        // Overloaded add method for three integers
//        public int add(int a, int b, int c) {
//            return a + b + c;
//        }
//
//        // Overloaded add method for two doubles
//        public double add(double a, double b) {
//            return a + b;
//        }
//    }
//
//
//public class Main {
//    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//
//        System.out.println("Sum of two integers: " + calc.add(5, 10));
//        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));
//        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));
//    }
//}
