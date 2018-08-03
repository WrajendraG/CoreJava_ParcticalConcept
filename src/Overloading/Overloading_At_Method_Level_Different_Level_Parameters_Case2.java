package Overloading;

/**
 * Created by raju on 6/1/17.
 */

class Promote_Calling_Level
{
    void m2(String s)
    {

        System.out.print("\n String Version "+s);

    }
    void m2(Object t )
    {

        System.out.print("\n Object Version ");
    }


}
public class Overloading_At_Method_Level_Different_Level_Parameters_Case2
{

    public  static  void main(String args[])
    {
        Promote_Calling_Level c = new Promote_Calling_Level();
        c.m2(new Object());
        c.m2("Java");
        c.m2(null );

    }
}


/*
 Object <- String
like collector <- Attender <- Peun

*
 Object Version
 String Version Java
 String Version null
* */