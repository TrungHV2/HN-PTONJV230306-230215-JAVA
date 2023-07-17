package com.ra.exercise2;

public class PersonAccount extends Account {
    private double fee;

    public PersonAccount() {
    }

    public PersonAccount(String accountNo, String customerName, double balance, double fee) {
        super(accountNo, customerName, balance);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void withDraw(double amount) {
        this.balance -= (amount + this.fee);
    }
    public void deposite(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "PersonAccount{" +
                "accountNo='" + accountNo + '\'' +
                ", customerName='" + customerName + '\'' +
                ", balance=" + balance +
                ", fee=" + fee +
                '}';
    }
}
