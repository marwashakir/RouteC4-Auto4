package day4;

import java.util.Scanner;

public class Rectangle {

    // Encapsulation -> data hiding, data protecting, data security

    Scanner input = new Scanner(System.in);

    // data hiding -> prevent direct modification of fields
    // benifits : improve security, maintainability and flexability

    private double length; // field
    private double width; // field

    public void setLength(double length)
    {
        if (length > 0)
            this.length = length;
        else
            System.out.println("length must be positive");
    }
     public double getLength() {
         return length;
     }

    public void setWidth(double width)
    {
        if (width > 0)
            this.width = width;
        else
            System.out.println("width must be positive");
    }
    public double getWidth() {
        return width;
    }
    public double calculateArea()
    {
        return length * width;
    }
//    public double calculateArea(){
//        System.out.println("Enter length of rechtangle");
//        length = input.nextDouble();
//        System.out.println("Enter width of rechtangle");
//        width = input.nextDouble();
//        double area = length * width;
//        System.out.println("The area of rechtangle is : " + area);
//        return area;
    }

