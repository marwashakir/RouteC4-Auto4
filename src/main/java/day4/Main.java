package day4;

public class Main {
   void main(String[] args) {
//       Sum s = new Sum();
//       s.sum2Number(10, 20);
//       s.sum2Number(10, 40);
//
//       hamada();
//       total(10, 20);
//       Rectangle rechtangle = new Rectangle();
//       double x = rechtangle.calculateArea();
//       System.out.println("The value of x : " + x);

       Rectangle r1 = new Rectangle();
       r1.setLength(5.5);
       r1.setWidth(5.5);
       double areaOfRoom1 = r1.calculateArea();
       System.out.println("The area of room 1 is : " + areaOfRoom1);

       Rectangle r2 = new Rectangle();
       r2.setLength(10.5);
       r2.setWidth(10.5);
       double areaOfRoom2 = r2.calculateArea();
       System.out.println("The area of room 2 is : " + areaOfRoom2);

       System.out.println("-----------------------");
       double totalArea = areaOfRoom1 + areaOfRoom2;
       System.out.println("The total space of room1 and room2 is : " + totalArea);

   }

    public static void hamada()
    {
        System.out.println("Hello, Hamada");
    }

    public void total(int x, int y)
    {
        int sum = x + y;
        System.out.println("The total is : " + sum);
    }
}
