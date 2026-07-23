package day4;

import java.util.Scanner;

public class letterSearch {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        boolean letterFound = false;

        for (int i = 0; i < fullName.length(); i++)
        {
            char currentLetter = fullName.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a')
            {
                letterFound = true;
            break;
        }
    }
      if(letterFound) // take last value of letterFound = true

          System.out.println("This name contain letter 'A' or 'a' ");
        else
            System.out.println("This name doesn't contain letter 'A' or 'a' ");
    }
}


