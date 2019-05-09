package com.Raton;
public class CheckingAccount extends BankAccount {
    private int totalTransactionCount;
    private static final double transactionFree=2.0;
    private static final int numberOffree=2;

    public CheckingAccount() {}

    public CheckingAccount(String accountName, String accountNumber, double balance) {
        super(accountName, accountNumber, balance);
        this.totalTransactionCount = 0;
    }
    public void CheckWithdraw(){
        if(balance>1000){
            System.out.println("you can withdraw your money.And your money is : "+balance);
        }else{
            System.out.println("You can't Withdraw your money.And your money is : "+balance);
        }
    }
    @Override
    public boolean depodit(double amount){
        if(super.depodit(amount)){
            totalTransactionCount++;
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public boolean withdraw(double amount){
        if (super.withdraw(amount))
        {
            totalTransactionCount++;
            return true;
        }
        else{
            return false;
        }
    }
    public void  deductfree(){
        if(totalTransactionCount>numberOffree)
        {
            double free = transactionFree *(totalTransactionCount-numberOffree);
                    if(super.withdraw(free)){
                        totalTransactionCount=0;
                    }
        }
    }
    @Override
    public void show(){
        System.out.println("Current Account Calculation :");
        System.out.println("Account name :"+this.accountName);
        System.out.println("Account number :"+this.accountNumber);
        System.out.println("Account balance :"+this.balance);
    }
}
