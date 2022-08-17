package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Overloading constructors.
    public BankAccount(){
        // using the "this" method to set default values when empty constructor is created.
        // parameters must match an overloaded constructor in the class file.
        this("Default name", 500.00, "default@reg.com");
        System.out.println("Empty Constructor created.");

    }

    public BankAccount(String name, double balance, String email){
        System.out.println("Constructor with fields created");
        this.customerName = name;
        this.balance = balance;
        this.email = email;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double money){
        this.balance += money;
        System.out.println("Your updated balance is: " + balance);
    }

    public void withdrawFunds(double money){
        if(this.balance < money){
            System.out.println("Insufficient funds!");
        }else {
            balance -= money;
            System.out.println("Your remaining balance is: " + balance);
        }
    }



}
