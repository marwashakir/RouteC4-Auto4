package day3;

import java.util.Scanner;

public class AddNumberDoWhile {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag; // false
        do {
            System.out.println("Enter first number");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is : " + sum);

            System.out.println("Would you sum others numbers? \n write true if you want to insert another number \n if not write false ");
            flag = sc.nextBoolean();

            if (flag == false) {
                System.out.println("Thank you for using this program ");
            }
        }
        while (flag); // = true






    }
}
