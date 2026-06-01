package day2;

public class operators {
    static void main(String[] args) {
//        int x = 10;
//        int y = 20;
//        System.out.println(x == y); // true
//        System.out.println(x = y); // 20
//        System.out.println("x = " + x);
//        System.out.println(x == y); // now x = 20
//        System.out.println(x != y); // false

//        double a = 15;
//        int b = 15;
//        System.out.println(a == b); // true
//        System.out.println(a != b); // false

//        int a = 25;
//        System.out.println("The value of a = " +a ); //25
//        int b = 25;
//        System.out.println("The sum of a and b = " + (a + b)); //50
//        a = a + 5; // 30
//
//        a += 5; // Shorthand assignment -> a = a + 5 = 35
//        System.out.println(a);
//
//        a = a - 5;
//        a -= 5;
//        System.out.println("The sub of a - 5 = " +a);
//
//        a = a * 5;
//        a *= 5;
//        System.out.println("The multi a * 5 = " +a);

//        a = a / 5;
//        a /= 5;
//        System.out.println("The div a / 5 = " +a);
//        System.out.printf("The div of a is: %d%n " ,a);

//        int x = 20;
//        int y = 3;
//        System.out.println(x % y);

        // Relational operators -> Binary

//        int a = 7;
//        int b = 5;
//        int c = 7;
//        int d = 7;
//
//        System.out.println(a > b);  // T
//        System.out.println(a < b);  // F
//        System.out.println(a == b); // F
//        System.out.println(a >= b); // T
//        System.out.println(a <= b); // F

        // Logical operators ->  unary and Binary

        boolean v1 = true;
        boolean v2 = false;

//        System.out.println(v1 && v2); // And -> F
//        System.out.println(v1 || v2); // OR -> T

//        System.out.println(a>b && b<c); // T
//                         // T      T
//        System.out.println(a>b && b>c); // F
//                         // T     F
//        System.out.println(a<b || d>a); // F
//                         // F      F
//        System.out.println(a<=b || d>=a); // T
//                         // F        T


//        int adbi = 20;
//        int almi = 15;
//        boolean tamioz = true;
//
//        if (adbi >= almi || tamioz)
//        {
//            System.out.println("ادخل علمي"); // T
//        }
//        else
//        {
//            System.out.println("ادخل ادبي"); // F
//        }

        // Increment and Decrement operators
          int num = 10;
        System.out.println(num++); // post increment -> num + 1 (Save in memory )
        System.out.println(num); // 11
        System.out.println(++num); // 12 pre increment =>

        int number = 5;
        System.out.println(number++); // 5
        System.out.println(number); //6
        System.out.println(++number);  // 7

        // Ternery operators
        int a = 18, b = 10, c;
        c = (a > b) ? a : b ; // if a > b is true then c = a false c = b
        System.out.println("The largest value is : " + c);

        if(a > b)
               c = a;
        else
               c = b;





    }
}
