package day8;

import java.util.Map;
import java.util.Scanner;

public class Users {

    Scanner input = new Scanner(System.in);
    void userList(Double balance)
    {
        System.out.println("Enter your ID: ");
        int id = input.nextInt();

        Map<Integer, Double> userMap = Map.of(
                1, balance,
                2, balance,
                3, balance
        );

        if (userMap.containsKey(1))
        {
            balance = 5000.0;
        }
        else if (userMap.containsKey(2)) {
            balance = 10000.0;
        }
        else if (userMap.containsKey(3)) {
            balance = 15000.0;
        }
    }
}