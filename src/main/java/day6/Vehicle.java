package day6;

public interface Vehicle {
      void start(); // abstract method

      default void stop()
      {
            System.out.println("Hello from vehicle interface");
      }

      default void stops()
      {
            System.out.println("Bike stops with a kick");
      }

      //Interfaces every method in it is an abstract method and must be used for any subclass
      //Abstract class every abstract method in it must be used in the subclasses but Concrete method not mandatory to use it
}
