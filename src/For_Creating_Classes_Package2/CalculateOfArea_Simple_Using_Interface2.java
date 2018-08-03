package For_Creating_Classes_Package2;
import java.util.Scanner;

 interface I11
{
    void areaOfSquare2();
}
interface I21
{
    void areaOfRectangle2();
}
class C1
{
    Scanner s2 = new Scanner(System.in);
  public   void areaOfCircle2()
    {
        double r,t;
        System.out.print("\n Calculating Area of circle ");
        System.out.print("\nEnter Radius of circle = ");
        r = Integer.parseInt(s2.nextLine());
        t = (3.14 * (r * r) );
        System.out.print("\n-------------------------------");
        System.out.println("\nArea is = "+t);
        System.out.print("\n-------------------------------");

    }
}
public class CalculateOfArea_Simple_Using_Interface2 extends C1 implements I11,I21
{
    Scanner s = new Scanner(System.in);

    public void areaOfSquare2()
    {
        int side,t;
        System.out.print("\n Calculating Area of Square ");
        System.out.print("\nEnter Any one Square Side length = ");
        side = Integer.parseInt(s.nextLine());
        t = (side *side);

        System.out.print("\n----------------------------- ");
        System.out.print("\nArea Of Square = "+t);
        System.out.print("\n----------------------------- ");
    }
    public void areaOfRectangle2()
    {
        float l,b,t;
        System.out.print("\n Calculating Area of Rectangle ");
        System.out.print("\n Enter Length of Square = ");
        l = Integer.parseInt(s.nextLine());
        System.out.print("\n Enter Base Of Square = ");
        b = Integer.parseInt(s.nextLine());
        t = (b+l);
        System.out.print("\n---------------------------- ");
        System.out.print("\nArea Of Rectangle is = "+t);
        System.out.print("\n----------------------------- ");

    }

}