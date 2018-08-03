package superkeword;

class BC3
{
    BC3()
    {
        System.out.println("Base default constructor ");

    }
}
class DC3 extends BC3
{
    DC3(int a, int b)
    {
        super();
        System.out.println("Drived");
        System.out.println("a = "+a +"  B = "+b);

    }
}


public class Super_Keyword_At_Constructor_Level_Rule3
{

    public static void main(String[] args)
    {
        DC3 o = new DC3(10,20);

    }

}