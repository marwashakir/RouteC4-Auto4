package day5;

public class Bike extends Vehicle {
    public Bike() {
        super("Yamaha", "blue", "2020");
    }

    public void ringBill() {
        System.out.println("The bike rings the bell");
    }
    @Override
    public void start()
    {
        System.out.println("The bike starts with a kick");
    }
}