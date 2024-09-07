package com.Interview.designpatterns.builderdesignpattern1;

public interface IBuilder {
    CustomerBuilder setFirstName(String firstName);
    CustomerBuilder setLastName(String lastName);
    CustomerBuilder setMiddleName(String middleName);
    CustomerBuilder setAge(int age);

}
