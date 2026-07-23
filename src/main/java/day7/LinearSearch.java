package day7;

import java.util.Scanner;
public class LinearSearch {
    Scanner input = new Scanner(System.in);

    String[] fruits = {"apple", "orange", "banana"};
    String target;
    boolean isFound = false;

    void search()
    {
        System.out.println("Enter fruit name, so engine can search: ");
        target = input.nextLine();

        for (int i = 0; i < fruits.length; i++)
        {
            if (fruits[i].equals(target.toLowerCase()))
            {
                System.out.println("Your favorite fruit is available at box: " + fruits[i]);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Your Favourite Fruit isn't Available");
        }
    }
}