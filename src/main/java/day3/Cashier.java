package day3;

import java.util.Scanner;

public class Cashier {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int quantity = sc.nextInt(); //5

        double totalPrice = 0;
        for(int i = 1; i<= quantity; i++) // i will loop till reach 5
        {
            System.out.println("Enter the cost of the item: "); //5 loops
            double itemPrice = sc.nextDouble();

            totalPrice += itemPrice; // totalprice = totalPrice + itemPrice -> shorthand operator
        }
           System.out.println("The total price is: " + totalPrice );



    }
}
