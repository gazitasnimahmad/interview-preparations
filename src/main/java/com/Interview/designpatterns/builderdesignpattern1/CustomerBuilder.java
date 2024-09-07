package com.Interview.designpatterns.builderdesignpattern1;

public class CustomerBuilder implements IBuilder{

    String firstName;
    String lastName;
    //Optional parameters
    String middleName;
    int age;

    @Override
    public CustomerBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public CustomerBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public CustomerBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
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
