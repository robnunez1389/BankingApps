package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String newCustomerName, double transaction) {
        Customer customer = findCustomer(newCustomerName);
        if(customer != null){
            return false;
        }
        return customers.add(new Customer(newCustomerName,transaction));
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction){
        Customer customer = findCustomer(nameOfCustomer);
        if(customer != null){
            customer.addTransactions(transaction);
            return true;
        }
        return false;
    }



    public Customer findCustomer(String name) {
        for(int i = 0; i<customers.size();i++){
            String nameMatch = customers.get(i).getName();
            if(name.equals(nameMatch)){
                return customers.get(i);
            }
        }
        return null;
    }
}
