package day3;

import java.util.Scanner;

public class employeeGrosspay {
    static void main(String[] args) {

        int hourRate = 15;
        int weeklyHourWorking = 40;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weekly hour working, please ");
        double empHourWorking = sc.nextDouble();

            while (empHourWorking > weeklyHourWorking || empHourWorking <= 0)
            {
                System.out.println(" Invalid entry . please enter between 1h to 40h");

            System.out.println("Enter your weekly hour working, please ");
            empHourWorking = sc.nextDouble();
            //break; -> BuG
        }
            double salary = empHourWorking * hourRate;
        System.out.println("Your weekly gross salary is : " + salary + "$");

    }
}
