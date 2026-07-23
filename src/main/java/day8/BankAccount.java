package day8;

public class BankAccount extends Users{
    private double balance;

    public void withdraw(double amount) throws InsufficientFundsException
    {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        if (amount > balance) {
            double shortfall = amount - balance;
            throw new InsufficientFundsException("Can not withdraw $" + amount + " with balance of $" + balance, shortfall);
        }
        balance -= amount;
    }
}