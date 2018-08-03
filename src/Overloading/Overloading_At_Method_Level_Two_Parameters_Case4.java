package Overloading;

/**
 * Created by raju on 6/1/17.
 */


class TestCase4
{
    void m4(int i, float f)
    {
        System.out.print("\n\tInt_float Version ");
    }
    void m4(float f, int i)
    {
        System.out.print("\n\tFloat_int Version ");

    }


}
public class Overloading_At_Method_Level_Two_Parameters_Case4
{
    public static void main(String args[])

    {
        TestCase4 o = new TestCase4();
        o.m4(10,20.7f);
        o.m4(10.4f,29);
     // o.m4(10,10);
        // Reference to m4() is Ambiguity
        // Error:(28, 8) java: reference to m4 is ambiguous
        // both method m4(int,float) in Overloading.TestCase4 and method m4(float,int) in Overloading.TestCase4 match

//o.m4(10.10f,29.23f);
//         //ce: can't find m4() Method.


    }

}
