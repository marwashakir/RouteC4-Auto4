package day6;

public class Circle extends Shape {

    @Override
    void draw()
    {
        System.out.println("Drawing a circle.");
    }

    @Override
    void info() {
        System.out.println(" This Shape is a circle");
    }
}
