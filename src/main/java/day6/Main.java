package day6;

public class Main {
    static void main(String[] args) {
        Shape S1 = new Circle();
        Shape S2 = new Square();

        S1.draw();
        S2.draw();

        S1.info();
        S2.info();

        Vehicle V1 = new Bike();
        Vehicle V2 = new Car();

        V1.start();
        V1.stops();
        V2.start();
    }
}
