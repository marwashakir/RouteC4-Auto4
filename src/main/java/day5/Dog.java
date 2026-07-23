package day5;

public class Dog extends Animal {

    public void bark()
    {
        System.out.println("This animal barks");
    }

//    @Override //this tells java , we will override a method from the parent class
//
//    public void eat()
//    {
//        System.out.println("This dog eats bones");
//    }

    @Override
    public void sounds()
    {
        System.out.println("The dog barks");
    }

}
