package com.example.testingproject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private String ID;
    private String name;
    private ArrayList <Customer> customer;

    public Bank(String ID, String name, ArrayList<Customer> customer) {
        this.ID = ID;
        this.name = name;
        this.customer = customer;
    }

    public Bank() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }
    public boolean provideLoan(double loanAmount , Customer c11) {
        if (c11.getBalance() >= loanAmount / 2) {
            c11.getBalance() += loanAmount;
            System.out.println("$" + loanAmount + " loan provided. New balance is $" + c.getBalance());
            return true;
        }
        else {
            System.out.println("Insufficient funds for loan.");
            return false;
        }
    }

}
