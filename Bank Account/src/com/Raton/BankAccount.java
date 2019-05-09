package com.Raton;

public abstract class BankAccount {
    protected String accountName;
    protected  String accountNumber;
    protected double  balance;
    public BankAccount(){}
    public BankAccount(String accountName, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    abstract void show();

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean depodit(double amount){
        if(amount>0)
        {
            balance+=amount;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean withdraw(double amount){
        if(amount>balance)
        {
            return false;
        }
        else{
            balance-=amount;
            return true;
        }
    }
}
