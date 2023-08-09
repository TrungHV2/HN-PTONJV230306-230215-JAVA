package com.ra;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {
    public static void main(String[] args) {
        Account acc = new Account(1000, "TrungHV");

        Thread t1 = new Thread(() -> {
           try {
               synchronized (acc) {
                   System.out.println("Đang kiểm tra số dư...");
                   boolean check = acc.checkAmount(1000);
                   Thread.sleep(3000);
                   if (check) {
                       System.out.println("Đang rút tiền...");
                       acc.withdraw(1000);
                       System.out.println("Đã rút xong!");
                   } else {
                       System.out.println("Số dư không khả dụng!");
                   }
               }
           } catch (Exception ex) {
               ex.printStackTrace();
           }
        });
        Thread t2 = new Thread(() -> {
           try {
               synchronized (acc) {
                   System.out.println("Đang kiểm tra số dư...");
                   boolean check = acc.checkAmount(1000);
                   Thread.sleep(3000);
                   if (check) {
                       System.out.println("Đang rút tiền...");
                       acc.withdraw(1000);
                       System.out.println("Đã rút xong!");
                   } else {
                       System.out.println("Số dư không khả dụng!");
                   }
               }
           } catch (Exception ex) {
               ex.printStackTrace();
           }
        });

        t1.start();
        t2.start();
    }
}
class Account {
    private double balance;
    private String accountName;

    public Account(double balance, String accountName) {
        this.balance = balance;
        this.accountName = accountName;
    }

    public boolean checkAmount(double amount) {
        return this.balance - amount >= 0;
    }

    public void deposit(double money) {
        double newBalance = this.balance + money;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance = newBalance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}

