package dayOne;

import javax.swing.*;
import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        //System.out.println("Hello Java");
        // System.out.println("Welcome, Ahmed");


        //  Scanner sc = new Scanner(System.in) ;
//        String name;
//        System.out.println("Enter your name");
//        name = sc.nextLine();
//       System.out.println("Welcome, " +name);

//        Scanner sc = new Scanner(System.in) ;
//        int a;
//        int b;
//        System.out.println("enter 2 numbers");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        System.out.println("The sum is : " +(a + b) );
//        System.out.println("The difference is : " +(a - b) );
//        System.out.println("the product is : " + (a * b) );
//        System.out.println(" The division is : " + (a / b) );


//        Scanner sc = new Scanner(System.in);
//        int i;
//        int a;
//        i = sc.nextInt();
//        a = sc.nextInt();


//        if (i > 0)
//        {
//            System.out.println("The number is positive");
//        }
//        else if (i<0)
//        {
//            System.out.println("the number is negative");
//
//        }
//        else
//        {
//            System.out.println("The number is zero");
//        }


//        if (a > i)
//            System.out.println(a);
//        else {
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);
       int num  ;
        num = sc.nextInt();

        switch(num) {
        case 1:
        {
            System.out.println("Saturday");
        }
        break;
        case 2:
        {
            System.out.println("Sunday");
        }
        break;
        case 3:
        {
            System.out.println("Monday");
        }
        break;
        case 4:
        {
            System.out.println("Tuesday");
        }
        break;
        case 5:
        {
            System.out.println("Wednesday");
        }
        break;
        case 6:
        {
            System.out.println("Thursday");
        }
        break;
        case 7:
        {
            System.out.println("Friday");
        }
        break;
        default:

        System.out.println("Invalid");
    }


    }
    }

