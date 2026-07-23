package day5;

public class BankAccount {
    private double balance; // Global variable

    public BankAccount(double initialBalance)
    {
        if(initialBalance < 0)
        {
            System.out.println("initial Balance cannot be negative . Setting balance to 0.");
        }
        balance = initialBalance;

    }
    public void deposit(double amount){
        if(amount > 0) {
           balance += amount;
        }
    }

    //get
    public double getBalance()
    {
       return balance;
    }
}
