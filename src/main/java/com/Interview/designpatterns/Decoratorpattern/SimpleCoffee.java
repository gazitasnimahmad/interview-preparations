package com.Interview.designpatterns.Decoratorpattern;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
