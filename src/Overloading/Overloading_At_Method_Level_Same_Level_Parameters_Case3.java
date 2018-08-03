package Overloading;

/**
 * Created by raju on 6/1/17.
 */
class Promote_Calling_Level2
{
    void m3(String s)
    {

        System.out.print("\n String Version "+s);

    }
    void m3(StringBuffer sb )
    {

        System.out.print("\n Object Version "+sb);
    }


}

public class Overloading_At_Method_Level_Same_Level_Parameters_Case3
{

    public  static  void main(String args[])
    {
        Promote_Calling_Level2 c = new Promote_Calling_Level2();
        c.m3("Java");
        c.m3(new StringBuffer("Let's go Java"));
       // c.m3(null ); CE = References to m3() is Ambiguity Because Both Method are call same time

    }
}

/*
 level 1 | Level 2
* object <- String
* object <- StringBuffer
*
* String Version Java
 Object Version Let's go Java
*
* */