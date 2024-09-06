package com.Interview.ObserverDesignpattern;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver(String weather);
}
