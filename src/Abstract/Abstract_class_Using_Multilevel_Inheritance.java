package Abstract;

/**
 * Created by raju on 16/1/17.
 */
abstract class C
{
    abstract void m1();
    abstract void m2();
}
abstract class C2 extends C
{
    void m1()
    {

        System.out.print("\n M1-From c2");
    }
}
class C3 extends C2
{
    void  m2()
    {

        System.out.print("\nm2 Form c3 ");
    }
    void m1()
    {
        System.out.print("\nm1 form c3 ");

    }
    void m3()
    {

        System.out.print("\nm3 form c3 ");
    }

}


public class Abstract_class_Using_Multilevel_Inheritance
{
    public static void main(String args [])
    {
        System.out.print("\n c3 = c3 ");
        C3 o3 = new C3();
        o3.m1();
        o3.m2();
        o3.m3();
 //--------------------------------------------------
        System.out.print("\n c2 = c3 ");
        C2 o2 = new C3();
        o2.m1();
        o2.m2();

     //   o2.m3();
        /*
    * Error:(51, 11) java: cannot find symbol
  symbol:   method m3()
  location: variable o2 of type Abstract.C2
        */
//----------------------------------------------------
        System.out.print("\n c1 = c3 ");
        C o1 = new C3();
        o1.m1();
        o1.m2();

      //  o1.m3();
        /*
        * Error:(55, 11) java: cannot find symbol
  symbol:   method m3()
  location: variable o1 of type Abstract.C
        */

    }

}
/*
*  c3 = c3
m1 form c3
m2 Form c3
m3 form c3
 c2 = c3
m1 form c3
m2 Form c3
 c1 = c3
m1 form c3
m2 Form c3
* */
