package com.Interview.lowleveldesign.designpatternspractice.singleton.builder;

public class Customer {
    String firstname;
    String lastname;
    int age;

    public Customer(CustomerBuilder customerBuilder) {
        this.firstname = customerBuilder.firstName;
        this.lastname = customerBuilder.lastName;
        this.age = customerBuilder.age;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }
}
