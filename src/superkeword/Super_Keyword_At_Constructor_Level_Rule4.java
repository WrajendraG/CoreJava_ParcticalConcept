package superkeword;

class BC4
{
    BC4(int a,int b)
    {
        System.out.println("Base ");

        System.out.println("a = "+a +"  B = "+b);
    }
}
class DC4 extends BC4
{
    DC4()
    {
        super(30,34);
        System.out.println("Drived");

    }
}


public class Super_Keyword_At_Constructor_Level_Rule4
{

    public static void main(String[] args)
    {
        DC4 o = new DC4();

    }

}