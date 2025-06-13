package com.Interview.designpatterns.Decoratorpattern;

public class MilkDecorator extends Decorator {

    public MilkDecorator(Coffee coffee) {
         super(coffee);
    }

    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription()+" : Milk";
    }

    @Override
    public int getPrice() {
        return coffeeDecorator.getPrice()+10;
    }
}
