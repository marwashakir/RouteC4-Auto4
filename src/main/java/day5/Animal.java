package day5;

public class Animal {
    // Inheritance : allows one class (child-subclass) to aquire the preperties and methods of another class (parent - super class )
    // java doesn't support multi inheritance - single inheritance => in future "interface"
    // Sub/child => Reuse parent fields and methods && i can own my fieldss and methods
    // Access modifiers => only public and protected are inherited, not private
//
//    public void eat()
//    {
//        System.out.println("This animal eats food");
//    }


    // 2- Runtime Polymorphism (method overloading) => Polymorphism

public void sounds()
{
    System.out.println("This animal sounds");
}


/*
-create a parent class 'Shape' with method 'draw'.
-subclasses : 'Circle', 'square', 'Triangle' each overwide 'draw()'.
-Store them in an arrey 'Shape[] shapes = {new Circle(), new Square(), new Triangle ()};'x
 */
}

