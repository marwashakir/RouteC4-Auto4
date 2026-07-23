package day6;

public class Square extends Shape{

    @Override
    void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    void info() {
        System.out.println(" This Shape is a square");
    }
}
