package Overloading;

/**
 * Created by raju on 6/1/17.
 */

class Animal
{

}
class Monkey extends Animal
{

}

public class Overloading_At_Method_Level_For_Calling_Case6
{

    void m6(Monkey m)
    {

        System.out.print("\n Overloading.Monkey Ver");

    }
    void m6(Animal m)
    {

        System.out.print("\n Overloading.Animal Ver ");
    }
    public static void main(String args[])
    {

        Overloading_At_Method_Level_For_Calling_Case6 t =new Overloading_At_Method_Level_For_Calling_Case6();

        Animal c1 = new Animal();
        t.m6(c1);  //parent Object ( call only parent methods)

        Monkey c2 = new Monkey();
        t.m6(c2);  //Child Object ( call child as will as parent Methods)

        Animal c3 = new Monkey();
        t.m6(c3);  //Child object but Parent References (Overloading.Animal) that's why call only Parent.

/*      Overloading.Monkey c4 = new Overloading.Animal();
        c4.m6();// Parent object but child  References (Overloading.Monkey) that's Not allowed in java.
*/
    }

}

/*
*
 Overloading.Animal Ver
 Overloading.Monkey Ver
 Overloading.Animal Ver

 */