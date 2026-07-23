package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {
    static void main(String[] args) throws Exception {
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
//        divideByZero(10, 0);
//        divideSafely(10, 2);
//
//        readFile();

        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw(0);
    }



    static void readFile() throws FileNotFoundException
    {
        try{
            FileInputStream file = new FileInputStream("RoutC4.txt");
        }catch (FileNotFoundException e){
            System.out.println("File not found" + e.getMessage());
        }
    }



    static void divideByZero(int x, int y)
    {
        try {
            // Code that might fail (throw exception)
            divideSafely(x, y);
            System.out.println(x / y);
        }
        catch (ArithmeticException e)
        {
            // Handle arithmetic exceptions specifically
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            // Handle any other exceptions
            // More general catch should come AFTER specific ones
            System.out.println(e.getMessage());
        }
        finally
        {
            // Code that ALWAYS executes, even if exception occurs
            // Perfect for cleanup: closing files, releasing resources
            System.out.println("Cleanup happens here");
        }
    }
    static void divideSafely(int x, int y)
    {
        if (y == 0)
        {
            System.out.println("Cannot divide by zero");
        }
//        int result = x / y;
//        System.out.println("Result is: " + result);
    }
}