package com.Interview.designpatterns.Decoratorpattern;

public abstract class Decorator implements Coffee {
    protected Coffee coffeeDecorator;

    public Decorator(Coffee coffeeDecorator){
        this.coffeeDecorator = coffeeDecorator;
    }

    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription();
    }

    @Override
    public int getPrice() {
        return coffeeDecorator.getPrice();
    }
}
