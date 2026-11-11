package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//
//        MyDouble a = new MyDouble(1);
//        MyDouble b = new MyDouble(2);
//
//        System.out.println(a.plus(b);

        System.out.println(0.1 + 0.2);

        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");

        System.out.println(a.add(b));

//        BankAccount account = new BankAccount("100.00");
//        account.deposit(new BigDecimal("50.00"));
//        System.out.println("After deposit: " + account.getBalance());
//        account.withdraw(new BigDecimal("30.00"));
//        System.out.println("After withdrawal: " + account.getBalance());
//        account.withdraw(new BigDecimal("1000.00")); //insufficient funds
//        System.out.println("Final balance: " + account.getBalance());

    }
}
