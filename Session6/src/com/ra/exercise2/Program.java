package com.ra.exercise2;

public class Program {
    public static void main(String[] args) {
        PersonAccount pa = new PersonAccount("0877823498234", "Customer A", 1000000, 3000);
        pa.withDraw(500000);
        pa.deposite(100000);
        System.out.println(pa);

        SavingAccount sa = new SavingAccount("983247283700", "Customer B", 100000000, 36);
        sa.checkInterest();
        System.out.println(sa);
    }
}
