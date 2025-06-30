package com.Interview.designpatterns.builderdesignpattern1;

public class MainClass {
    public static void main(String[] args){
        Customer customer = new CustomerBuilder().setFirstName("gazi").setAge(28).build();
        System.out.println(customer.getFirstName()+customer.getLastName());
    }
}
