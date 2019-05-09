package com.Raton;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new SavingAccount("Raton","789456",500,10);
        b1.depodit(500);
        b1.show();
        ((SavingAccount) b1).CheckWithdraw();
        JOptionPane.showMessageDialog(null,"For Saving Account before Interest "+b1.getBalance());
        //System.out.println("Before Interest : "+b1.getBalance());
        ((SavingAccount) b1).CalculateInterestRate(1);
        JOptionPane.showMessageDialog(null,"For Saving Account After Interest "+b1.getBalance());
        //System.out.println("After Interest : "+b1.getBalance());
        BankAccount c1 = new CheckingAccount("Rashi","175963",1000);
        c1.depodit(1000);
        c1.withdraw(200);
        c1.depodit(700);
        ((CheckingAccount) c1).deductfree();
        c1.show();
        ((CheckingAccount) c1).CheckWithdraw();
        JOptionPane.showMessageDialog(null,"For Checking Account Before Transaction :"+c1.getBalance());
        //System.out.println("Before Transaction : "+c1.getBalance());
        c1.depodit(200);
        ((CheckingAccount) c1).deductfree();
        JOptionPane.showMessageDialog(null,"For Checking Account After Transaction :"+c1.getBalance());
        //System.out.println("After Transaction : "+c1.getBalance());

    }
}
