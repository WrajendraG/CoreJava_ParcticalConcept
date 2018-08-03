package For_Creating_Classes_Package2;
import java.util.Scanner;

interface I1Area
{
    void areaOfCircle();
}
interface I2Squa
{
    void areaOfSquare();
}
interface I3Rect
{
    void areaOfRectangle();
}

public class CalculateOfArea_Simple_Using_Interface implements I1Area,I2Squa,I3Rect
{
    Scanner s = new Scanner(System.in);

    public void areaOfCircle()
    {
        double r,t;
        System.out.print("\n Calculating Area of circle ");
        System.out.print("\nEnter Radius of circle = ");
        r = Integer.parseInt(s.nextLine());
        t = (3.14 * (r * r) );
        System.out.print("\n-------------------------------");
        System.out.println("\nArea is = "+t);
        System.out.print("\n-------------------------------");

    }
    public void areaOfSquare()
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
    public void areaOfRectangle()
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