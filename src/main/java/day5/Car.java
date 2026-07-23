package day5;

public class Car extends Vehicle {
    public Car()
    {
        super("BMW", "RED", "2026");
    }

    public void honk()
    {
        System.out.println("The car honks: Beep Beep!");
    }

    @Override
    public void start()
    {
        System.out.println("The car starts with a roar");
    }
}
