package dayOne;

public class FirstJavaProgram {
    public static void main(String[] args)
    {
        System.out.println("Hello big boy!");
        //comment line
        /*
        comment
        comment
        System.out.println("Hello big boy!");
        */
        //varibale
        //Declaration

        //DataType varibalName = value -> initialization
//        String firstName = "Marwa"; //store text into varibal -> String can contain letters ,numbers ,and special characters ""
//        String x = "2 + 2";
//        System.out.println(x);
//
//        String X = "10";
//        String Y = "15";
//
//        System.out.println(X + Y); // 1015 concatenation -> combining two strings together

        // Numbers
        // 1- int

        int x = 1000;
        int y = 2000;
     //   System.out.println( x + y);
      //  System.out.println("Sum of x and y is :" , x + y); //problem number 2
//        System.out.println(" Sum of x and y is : ");
//       System.out.println( x + y);
//
//        // 2- Float
//        float f = 12.89f;
//        System.out.println(f);
        // 3- Double
//         double d = 55; //55.0
//         double l = 55.33; //55.33
//        System.out.println(d);
//        System.out.println(l);

        String firstName = " Yara";
        String lastName = " Mostafa";

        String fullName = firstName + " " + lastName;
        int age = 19;
        String dateOfBirth = " 20-5-2002";
        String job = " Testing Engineer ";
        double income = 10.5;
        double tax = income * 0.15; // 15% tax
        double netSalary = income - tax;


        //print
        System.out.println("Hello my name is: " +fullName+
                "\nmy age is: " +age+
                "\nmy date of birth is: " +dateOfBirth+
                "\nmy age is: " +age+
                "\nmy Job is: " +job+
                "\nmy income is: " +netSalary);

        System.out.println("...............................");

        System.out.printf("Hello my full name is : %s%n"
        +"my age is : %d%n"
        +"my job is : %s%n"
        +"my income is : %f%n",
        fullName, age, job, netSalary);





    }
}
