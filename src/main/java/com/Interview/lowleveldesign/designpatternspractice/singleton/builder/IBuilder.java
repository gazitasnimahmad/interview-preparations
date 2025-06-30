package com.Interview.lowleveldesign.designpatternspractice.singleton.builder;


public interface IBuilder {
    CustomerBuilder setFirstName(String firstName);
    CustomerBuilder setlastName(String lastName);
    CustomerBuilder setAge(int age);

}
