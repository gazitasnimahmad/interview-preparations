package com.Interview.designpatterns.Decoratorpattern;

import com.Interview.designpatterns.Strategypattern.ShoppingCart;

public class SugarDecorator extends Decorator {
    public SugarDecorator(Coffee coffee){
        super(coffee);}

    @Override
    public int getPrice() {
        return coffeeDecorator.getPrice()+5;
    }

    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription()+" : sugar";
    }
}
