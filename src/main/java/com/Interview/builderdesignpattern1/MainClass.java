package com.Interview.builderdesignpattern1;

public class MainClass {
    public static void main(String[] args){
        Customer customer = new CustomerBuilder().setFirstName("gazi").setLastName("tasnim").setAge(28).build();
        System.out.println(customer.getMiddleName());
    }
}
