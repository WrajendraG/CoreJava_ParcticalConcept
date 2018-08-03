package Interface;

/**
 * Created by raju on 18/1/17.
 */

interface I1
{
    void m1();

}
interface I2 extends I1
{
    void m2();
}
abstract class C11
{
        void m3()
        {
            //null Body
        }
}
abstract class C22 extends C11 implements I1,I2
{
    public void m1()
    {
        System.out.print("\n I am m1() From abstract class Interface.C22 extends Interface.C11 implements Interface.I1,Interface.I2 ");
    }
    public void m3()
    {
            //super.m3();
        System.out.print("\n I am m3() From abstract class Interface.C22 extends Interface.C11 implements Interface.I1,Interface.I2 ");
    }
}
class C33 extends C22
{
    public void m2()
    {
       System.out.print("\n I am m2() From class Interface.C33 extends Interface.C22");
    }
    public void m1()
    {
        System.out.print("\n I am m1() From class Interface.C33 extends Interface.C22 ");
    }
    public void m3()
    {
            super.m3();

        System.out.print("\n I am m3() From class Interface.C33 extends Interface.C22 ");
    }

    void m4()
    {
        System.out.print("\n I am m4() Form class Interface.C33 extends Interface.C22 Itself ");
    }
}

public class Interface_Example_Include_All_Approach
{
    public static void main (String args [])
    {

System.out.print("\n ------------------------------------( 1 )-------------------------------------------");

        //  ( 1 ) Object For Child or Derived or Concurrent class  Using same ( Abstract.C D Abstract.C ) References

            C33 o3 = new C33();

            o3.m1();    // I am m1() From class Interface.C33 extends Interface.C22

            o3.m2();    //  I am m2() From class Interface.C33 extends Interface.C22

            o3.m3();    // I am m3() From class Interface.C33 extends Interface.C22

            o3.m4();    //I am m4() Form class Interface.C33 extends Interface.C22 Itself

        // All Interface.C33 class Method are called Because All Available in Derived class(Interface.C33).

System.out.print("\n --------------------------------( 2 )-----------------------------------------------");

        // ( 2 ) Object for Base class Using Child (Derived class Or Intermediate ) References.

            C22 o2 = new C33();

            o2.m1();    // I am m1() From class Interface.C33 extends Interface.C22

            o2.m2();    // I am m2() From class Interface.C33 extends Interface.C22

            o2.m3();    // I am m3() From class Interface.C33 extends Interface.C22

//          o2.m4();    // Error Method m4() Cant Find Symbole Type Interface.C22

System.out.print("\n -------------------------------( 3 ) ------------------------------------------------");

        //  ( 3 ) Object For Base class Using intraface

  //          Interface.C22 o1 = new Interface.C22();   // Interface.C22 Can't Create Object Because Is's Abstract class.

            I1 o1 = new C33();

            o1.m1();    // I am m1() From class Interface.C33 extends Interface.C22

// Using This Object Access Only m1() Method Because (Reference) with in Interface is Declare Only one method .

            I2 o11 = new C33();

            o11.m1();   // I am m1() From class Interface.C33 extends Interface.C22

            o11.m2();   //I am m2() From class Interface.C33 extends Interface.C22

// You cant call Another Method
// Using This Object Access Two Method Because Interface Interface.I1 extends in Interface Interface.I2
// But Call's First look  Methods Available Interface.C33();

System.out.print("\n --------------------------------( 4 )-----------------------------------------------");

    // ( 4 )
        C11 oc1 = new C33();

        oc1.m3();   // I am m3() From class Interface.C33 extends Interface.C22 but Its not null as per References .

        // Because Compiler look Method Bottom to top and that time those find another same name method it will execute  .
        // You should call Top m3() null body Method but you have Delete m3() From class Interface.C33 extends Interface.C22
        // then Compiler Execute m3() method From abstract class Interface.C22 extends Interface.C11 implements Interface.I1,Interface.I2 Delete also this
        //Finally  execute m3() From Interface.C11 class .outPut Show Null(Nothing Because Is only Defining )

        System.out.print("\n --------------------------------( 5 )-----------------------------------------------");

        System.out.print("\n Finally use super keyword to Access All Overriding / Overridden Method's (super.m3(); write First )");

        System.out.print("\n --------------------------------Access all------------------------------------------");
    }

}
/*

 ------------------------------------( 1 )-------------------------------------------
 I am m1() From class Interface.C33 extends Interface.C22
 I am m2() From class Interface.C33 extends Interface.C22
 I am m3() From abstract class Interface.C22 extends Interface.C11 implements Interface.I1,Interface.I2
 I am m3() From class Interface.C33 extends Interface.C22
 I am m4() Form class Interface.C33 extends Interface.C22 Itself
 --------------------------------( 2 )-----------------------------------------------
 I am m1() From class Interface.C33 extends Interface.C22
 I am m2() From class Interface.C33 extends Interface.C22
 I am m3() From abstract class Interface.C22 extends Interface.C11 implements Interface.I1,Interface.I2
 I am m3() From class Interface.C33 extends Interface.C22
 -------------------------------( 3 ) ------------------------------------------------
 I am m1() From class Interface.C33 extends Interface.C22
 I am m1() From class Interface.C33 extends Interface.C22
 I am m2() From class Interface.C33 extends Interface.C22
 --------------------------------( 4 )-----------------------------------------------
 I am m3() From abstract class Interface.C22 extends Interface.C11 implements Interface.I1,Interface.I2
 I am m3() From class Interface.C33 extends Interface.C22
 --------------------------------( 5 )-----------------------------------------------
 Finally use super keyword to Access All Overriding / Overridden Method's (super.m3(); write First )
 --------------------------------Access all------------------------------------------
             */