package superkeword;

class BC1
{
    BC1()
    {
        System.out.println("Base Default constructor ");


    }
}
class DC1 extends BC1
{
    DC1()
    {
       super();
        System.out.println("Derived Default constructor");

    }
}


public class Super_Keyword_At_Constructor_Level_Rule1
{

    public static void main(String[] args)
    {
        BC1 o = new DC1();

    }

}