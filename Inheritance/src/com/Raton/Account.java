package com.Raton;

    public class Account {
    private String AccountNumber;
    private double Balance;
    private String CustomerName;
    private String CustomerEmailAddress;
    private String CustomerPhoneNumber;

        public Account(String accountNumber, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
            AccountNumber = accountNumber;
            Balance = balance;
            CustomerName = customerName;
            CustomerEmailAddress = customerEmailAddress;
            CustomerPhoneNumber = customerPhoneNumber;
        }

        public void Deposit(double DepositAmount)

     {
         this.Balance+=DepositAmount;
         System.out.println("Deposit of"+DepositAmount+"made.new balance is: "+this.Balance);
     }
     public void Withdrawal(double WithdrawalAmount)
     {
         if(Balance-WithdrawalAmount<=0)
         {
             System.out.println("Only "+this.Balance+"available.Withdrawal Amount Not processed");
         }
         else
         {
             this.Balance-=WithdrawalAmount;
             System.out.println("Withdrawal Amount of "+WithdrawalAmount+"processed. Remaining Balance"+this.Balance);
         }

     }
    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return CustomerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        CustomerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        CustomerPhoneNumber = customerPhoneNumber;
    }
}
