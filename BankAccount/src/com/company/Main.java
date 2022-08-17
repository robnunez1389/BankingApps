package com.company;

public class Main {

    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();
//        System.out.println(bankAccount.getBalance());
//        bankAccount.depositFunds(1000.00);
//        bankAccount.withdrawFunds(2000.00);
//        System.out.println(bankAccount.getBalance());
//        System.out.println(bankAccount.getCustomerName());
//        BankAccount robAccount = new BankAccount("Brittany", 700.00, "BrittNoon@gmail.com");
//        System.out.println(robAccount.getCustomerName());

        VipCustomer rob = new VipCustomer();
        System.out.println(rob.getCreditLimit());
        VipCustomer britt = new VipCustomer("Brittany", "britt@gmail.com");
        System.out.println(britt.getCreditLimit());
        System.out.println(rob.getEmail());
    }
}
