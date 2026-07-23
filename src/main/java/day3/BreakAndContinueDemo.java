package day3;

public class BreakAndContinueDemo {
    static void main(String[] args) {
        for(int i = 1; i<= 10; i++)
        {
            if(i==5)
                break;
            System.out.println("Break : " +i);
        }


        System.out.println("-------------------------");

        for(int i = 1; i<= 10; i++)
        {
            if(i==5)
               continue;
            System.out.println("continue : " +i);
        }


        for(int i = 10; i<= 10; i--)
        {
            if(i==5)
                break;
            System.out.println("continue : " +i);
        }



        for(int i = 1; i<= 10; i--)
        {
            if(i== -5)
                break;
            System.out.println("break : " +i);
        }

    }
}
