package com.ra.exercise2;

import java.text.MessageFormat;

public class SavingAccount extends Account {
    private double rate;
    private int period;

    public SavingAccount() {
    }

    public SavingAccount(String accountNo, String customerName, double balance, int period) {
        super(accountNo, customerName, balance);
        this.period = period;
        this.rate = calculatorRate(period);
    }

    public double getRate() {
        return rate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
        this.rate = calculatorRate(period);
    }

    public void checkInterest() {
        double money = this.balance * this.rate/100/12 * this.period;
        System.out.println(MessageFormat.format("Số tiền lãi suất sau kỳ hạn {0} tháng là {1}", this.period, money));
    }

    public double calculatorRate(int period) {
        switch (period) {
            case 1:
                return 5;
            case 3:
                return 5.5;
            case 6:
                return 6;
            case 12:
                return 7;
            case 24:
                return 7.5;
            case 36:
                return 8;
            default:
                return 1.8;
        }
    }

    @Override
    public String toString() {
        return MessageFormat.format("SavingAccount[accountNo={0}, customerName={1}, balance={2}, rate={3}, period={4}]", this.accountNo, this.customerName, this.balance, this.rate, this.period);
    }
}
