package day6;

abstract class Shape {

    // Abstraction : Hiding implementation details and showing only the essential behavior to the user .
    // Focus on : what an object does. not how it does it
    /*
    in real life : when you drive a car you use the stearing wheel and pedals (interface)
    but you don't worry about how the engine works (implementation hidden)
    you just care about the function
     */

    /*
    1-Abstract class
    - can have both abstract methods ( no body ) and concrete methods
    - cannot be instantiated directly

    2-interfaces
    - Pure abstraction ( before Java 8 : only abstract methods , later default and static methods allowed )
    - a class can implement multiple interfaces
     */
    abstract void draw (); // abstract

    void info() // concrete method
    {
        System.out.println("Shape info : This is a shape.");
    }

}
