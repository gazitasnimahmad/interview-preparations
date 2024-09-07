package com.Interview.designpatterns.builderdesignpattern1;

public class Customer {
    private String firstName;
    private String lastName;
    //Optional parameters
    private String middleName;
    private int age;

    public Customer(CustomerBuilder customerBuilder) {
        this.firstName=customerBuilder.firstName;
        this.lastName = customerBuilder.lastName;
        this.middleName=customerBuilder.middleName;
        this.age=customerBuilder.age;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.getLastName();
    }

    public String getMiddleName(){
        return this.middleName;
    }

    public int getAge(){
        return this.age;
    }

}
