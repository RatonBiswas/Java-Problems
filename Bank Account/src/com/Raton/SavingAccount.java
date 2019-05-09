package com.Raton;

public class SavingAccount extends BankAccount {
    private double interestrate;

    public SavingAccount(){}

    public SavingAccount(String accountName, String accountNumber, double balance, double interestrate) {
        super(accountName, accountNumber, balance);
        this.interestrate = interestrate;
    }
    public void CheckWithdraw(){
        if(balance>500){
            System.out.println("you can withdraw your money.And your money is : "+balance);
        }else{
            System.out.println("you can't withdraw your money.And your money is : "+balance);
        }
    }
    public void CalculateInterestRate(double interestrate){
        double rate=getBalance()*interestrate/100;
        this.depodit(rate);
    }
    @Override
    public void show(){
        System.out.println("Saving Account Calculation :");
        System.out.println("Account name :"+this.accountName);
        System.out.println("Account number :"+this.accountNumber);
        System.out.println("Account balance :"+this.balance);
    }

}
