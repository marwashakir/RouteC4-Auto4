package day6;

public class Bike implements Vehicle {
    @Override
    public void start()
    {
        System.out.println("Bike starts with a kick");
    }

    @Override
    public void stops() {
        System.out.println("Bike stops with a kick");
    }
}
