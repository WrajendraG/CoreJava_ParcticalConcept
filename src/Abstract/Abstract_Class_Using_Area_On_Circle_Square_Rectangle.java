package Abstract;
/**
 * Created by raju on 14/1/17.
 */
import java.util.*;

abstract class Area_Calculation
{
    Scanner s = new Scanner(System.in);

    abstract void area();

}
class Area_Circle extends Area_Calculation
{
        double r,t;
    void area()
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
class Area_Square extends Area_Calculation
{
    int side,t;
    void area()
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

class Area_Rectangle extends Area_Calculation
{
        float l,b,t;
    void area()
    {
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


public class Abstract_Class_Using_Area_On_Circle_Square_Rectangle
{
        public static void main(String args [])
        {
            Area_Calculation obj ;

            obj = new Area_Circle();
            obj.area();

            obj = new Area_Square();
            obj.area();

            obj = new Area_Rectangle();
            obj.area();



        }

}
/*
* Calculating Area of circle
Enter Radius of circle = 5

-------------------------------
Area is = 78.5

-------------------------------
 Calculating Area of Square
Enter Any one Square Side length = 5

-----------------------------
Area Of Square = 25
-----------------------------
 Calculating Area of Rectangle
 Enter Length of Square = 5

 Enter Base Of Square = 5

----------------------------
Area Of Rectangle is = 10.0
-----------------------------
 */