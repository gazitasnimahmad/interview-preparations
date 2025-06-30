package com.Interview.lowleveldesign.designpatternspractice.singleton.builder;

public class mainCustomer {
    public static void main(String[] args){
        Customer customer = new CustomerBuilder().setFirstName("gazi").setAge(28).build();
        System.out.println(customer.getFirstname()+customer.getLastname()+customer.getAge());

    }
}
