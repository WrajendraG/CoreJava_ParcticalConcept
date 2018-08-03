package superkeword;

class BC2
{
    BC2(int a)
    {
        System.out.println("Base Parameterized constructor ");
        System.out.println(" a = "+a);

    }
}
class DC2 extends BC2
{
    DC2(int a, int b)
    {
        super(333);
        System.out.println("Drived");
        System.out.println("a = "+a +"  B = "+b);

    }
}


public class Super_Keyword_At_Constructor_Level_Rule2
{

    public static void main(String[] args)
    {
        DC2 o = new DC2(10,20);

    }

}