package com.Interview.designpatterns.Decoratorpattern;

public class MainClass {
    public static void main(String[] args){
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
//        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription() + ": price "+ coffee.getPrice());
    }
}
