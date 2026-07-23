package day5;

public class Person {
    String name; // global variable / Field
    int age;
    char gender;

    // Constructor : special method in a class that is automatically called when an object is created.

      // defauit constructor
    //person ()
    {
        System.out.println("I'm the default constructor");

    }

    // signature
    //person(String name, int age, char gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printData()
    {
        System.out.println("Hello my name is " + name + "I'm " + age + "years old and my gender is " + gender);
    }
}
