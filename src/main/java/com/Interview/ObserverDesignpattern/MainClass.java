package com.Interview.ObserverDesignpattern;

public class MainClass {

    public static void main(String[] args){
        WeatherStationConcreteSubject weatherStation = new WeatherStationConcreteSubject();
        weatherStation.addObserver(new MobileObserver());
        weatherStation.addObserver(new TelevisionObserver());

        weatherStation.setWeather("sunny");
    }
}
