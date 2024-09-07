package com.Interview.designpatterns.ObserverDesignpattern;

public class MainClass {

    //The Observer Design Pattern is a behavioral design pattern that defines a one-to-many dependency
    // between objects so that when one object (the subject) changes state, all its dependents (observers)
    // are notified and updated automatically.

    /*
    The Observer Design Pattern is a powerful tool for creating systems where changes in one component need to
    be propagated to others. It promotes loose coupling, makes code more flexible, and supports real-time updates,
     making it highly beneficial in various application domains like event handling, data binding,
     and real-time notifications.
     */

    public static void main(String[] args){
        WeatherStationConcreteSubject weatherStation = new WeatherStationConcreteSubject();
        weatherStation.addObserver(new MobileObserver());
        weatherStation.addObserver(new TelevisionObserver());

        weatherStation.setWeather("sunny");
    }
}
