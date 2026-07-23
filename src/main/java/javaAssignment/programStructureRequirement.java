package javaAssignment;


import java.util.Scanner;

public class programStructureRequirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println(
                    "=========================\n" +
                            "Number Analyzer Menu\n" +
                            "=========================\n" +
                            "1 - Print Numbers 10 to 1\n" +
                            "2 - Print Even/Odd Report\n" +
                            "3 - Check Number Type\n" +
                            "4 - Calculate Sum Between Two Numbers\n" +
                            "5 - Exit\n" +
                            "=========================\n"
            );

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printNumbersDescending();
                    break;

                case 2:
                    printEvenOrOdd();
                    break;

                case 3:
                    System.out.println("Enter a number");
                    int num = sc.nextInt();
                    System.out.println(checkNumberType(num));
                    break;

                case 4:
                    System.out.println("Enter your first number");
                    int n1 = sc.nextInt();
                    System.out.println("Enter your second number");
                    int n2 = sc.nextInt();
                    System.out.println("Sum is : " + calculateSum(n1, n2));
                    break;

                case 5:
                    exit();
                    break;

                default:
                    System.out.println("INVALID CHOICE");
            }

        } while (choice != 5);

        sc.close();
    }

    public static void printNumbersDescending() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void printEvenOrOdd() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
    }

    public static String checkNumberType(int number) {
        if (number < 0) {
            return "Negative";
        } else if (number > 0) {
            return "Positive";
        } else {
            return "Zero";
        }
    }

    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    public static void exit() {
        System.out.println("Thank you for using Number Analyzer");
    }
}
