package For_Creating_Classes_Package2;

import java.util.*;

class Area_Circle
{
    double r,t;
    Scanner s = new Scanner(System.in);
   public void areaOfCircle()
    {
        System.out.print("\n Calculating Area of circle ");
        System.out.print("\nEnter Radius of circle = ");
        r = Integer.parseInt(s.nextLine());
        t = (3.14 * (r * r) );
        System.out.print("\n-------------------------------");
        System.out.println("\nArea is = "+t);
        System.out.print("\n-------------------------------");

    }
}
class Area_Square extends Area_Circle
{
    int side,t;
    public void areaOfSquare()
    {
        System.out.print("\n Calculating Area of Square ");
        System.out.print("\nEnter Any one Square Side length = ");
        side = Integer.parseInt(s.nextLine());
        t = (side *side);

        System.out.print("\n----------------------------- ");
        System.out.print("\nArea Of Square = "+t);
        System.out.print("\n----------------------------- ");
    }

}

public class CalculateOfArea_Multilevel extends Area_Square
{
    float l,b,t;
    public void areaOfRectangle()
    {
        System.out.print("\n Calculating Area of Rectangle ");
        System.out.print("\n Enter Length of Square = ");
        l = Integer.parseInt(s.nextLine());
        System.out.print("\n Enter Base Of Square = ");
        b = Integer.parseInt(s.nextLine());
        t = (b + l);
        System.out.print("\n---------------------------- ");
        System.out.print("\nArea Of Rectangle is = " + t);
        System.out.print("\n----------------------------- ");

    }
}
