package com.Interview.lowleveldesign.designpatternspractice.singleton.builder;

public class CustomerBuilder implements IBuilder {
     String firstName;
     String lastName;
     int age;

    @Override
    public CustomerBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public CustomerBuilder setlastName(String lastName) {
        this.lastName=lastName;
        return this;
    }

    @Override
    public CustomerBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    
    public Customer build(){
        return new Customer(this);
    }
}
