package com.example.testingproject;

import javafx.scene.paint.PhongMaterial;

public class Customer {
    private String name;
    private int ID;
    private String Phone;
    private double Balance;

    public Customer( int ID, String name, String phone, double balance) {
        this.name = name;
        this.ID = ID;
        Phone = phone;
        Balance = balance;
    }
    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void showBalance(double Balance){
        System.out.println("your balance is:" + Balance);
    }
    public void deposit(double amount){
        if(amount > 0){
            Balance += amount;
        }
        else{
            System.out.println("Invalid Amount");
        }

    }
    public void withdraw(double amount){
        if( amount <= Balance ){
            Balance-= amount;
        }
        else {
            System.out.println("insufficient funds");
        }
    }
    public void creataccount (String name , String phone , double deposit , int ID){
        if( deposit > 0 ){
            Customer C1 = new Customer(ID , name , phone , deposit);
            System.out.println("An Account has been created ");
            System.out.println("welcome " + name);
        }
        else {
            System.out.println("sorry cant creat account due to insufficient funds");
        }
    }
    public void transfer(double amount , Customer c1 , Customer c2 ){
        if(amount < c1.Balance){
            c1.Balance -= amount;
            c2.Balance += amount;
        }
        else {
            System.out.println("cant make the transfer due to insufficient balance");
        }
    }
}
