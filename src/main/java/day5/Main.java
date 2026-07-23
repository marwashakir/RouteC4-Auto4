package day5;

public class Main {
   public static void main(String[] args) {
//        Person person = new Person();
//        Person p1 = new Person("Ahmed", 27, 'M');
//        p1.printData();
//
//        BankAccount bankaccount = new BankAccount(1000);
//        bankaccount.getBalance(); //1000
//        bankaccount.deposite(500);
//        bankaccount.getBalance(); //1500

//         Dog d = new Dog();
//         d.eat();
//         d.bark();

//           Car car = new Car();
//
//           car.start(); // inherited methods from vehicle
//           car.honk(); // car's own methods
//
//       Bike bike = new Bike();
//
//       bike.start();
//       bike.ringBill();

//       MathUtils mathutils = new MathUtils();
//       mathutils.add(10, 20); // int version
//       mathutils.add(10, 20.6); // double version

//       Dog dog = new Dog();
//       dog.sounds();

       Shape[] shapes = {new Circle(),new Square(), new Triangle()};
       for(Shape shape: shapes)
       {
           shape.draw();
       }

    }
}
