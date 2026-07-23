package day5;

public class MathUtils {

    // polymorphism : 'Many forms'
    // it allows the same method name or same interface to represent different underlying behaviors.
    // 1- compile_time polymorphism (Method Overloading)

    /*
    - same methods name , different paramater lists (different signatures)
    - Decision mode at ** compile time **
     */

    // int version
    int add (int a, int b){
        System.out.println("Int version of add method is called");
        return a + b;
    }

    // double version
    double add(double a, double b){
        System.out.println("Double version of add method is called");
        return a + b;
    }
}
