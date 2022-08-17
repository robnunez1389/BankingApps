package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        var branch = findBranch(branchName);
        if(branch != null){
            System.out.println(branch.getName()+ " branch already exists");
            return false;
        }
        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction){
        var branch = findBranch(branchName);
        var customer = branch.findCustomer(customerName);
        if(customer != null){
            System.out.println("Customer [" + branch.getName()+ "] already exists");
            return false;
        }
        branch.newCustomer(customerName, transaction);
        return true;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        var branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName,transaction);
        }
        return false;
    }

    public Branch findBranch(String name){
        for(int i = 0; i<branches.size();i++){
            String nameMatch = branches.get(i).getName();
            if(name.equals(nameMatch)){
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean includeTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch "+ branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i = 0; i<branchCustomers.size();i++){
                System.out.println("Customer: "+ branchCustomers.get(i).getName() + " ["+(i+1)+"] ");
                if(includeTransactions){
                    ArrayList<Double> customerTransactions = branch.getCustomers().get(i).getTransactions();
                    System.out.println("Transactions");
                    for(int j = 0; j < customerTransactions.size();j++){
                        System.out.println(" ["+(j+1)+"]  Amount " + customerTransactions.get(j));
                    }

                }
            }
            return true;
        }
        return false;
    }

}
