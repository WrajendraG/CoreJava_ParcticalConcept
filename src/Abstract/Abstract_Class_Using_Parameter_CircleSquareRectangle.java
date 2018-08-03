package Abstract; /**
 * Created by raju on 15/1/17.
 */
import java.util.*;

abstract class Area_Calculation1
{
    Scanner s = new Scanner(System.in);

    abstract void area();

}
class Area_Circle1 extends Area_Calculation1
{
    double r,t;
    void area()
    {
        System.out.print("\n Calculating Area of Parameter in circle ");
        System.out.print("\nEnter Radius of circle = ");
        r = Integer.parseInt(s.nextLine());
        t = (2 * 3.14 * (r * r));
        System.out.print("\n-------------------------------");
        System.out.println("\nArea is = "+t);
        System.out.print("\n-------------------------------");

    }
}
class Area_Square1 extends Area_Calculation1
{
    int side,t;
    void area()
    {
        System.out.print("\n Calculating Area of Parameter in Square ");
        System.out.print("\nEnter Any one Square Side length = ");
        side = Integer.parseInt(s.nextLine());
        t = (2 * side * side);

        System.out.print("\n----------------------------- ");
        System.out.print("\nArea Of Square = "+t);
        System.out.print("\n----------------------------- ");
    }

}

class Area_Rectangle1 extends Area_Calculation1
{
    float l,b,t;
    void area()
    {
        System.out.print("\n Calculating Area of Parameter in Rectangle ");
        System.out.print("\n Enter Length of Square = ");
        l = Integer.parseInt(s.nextLine());
        System.out.print("\n Enter Base Of Square = ");
        b = Integer.parseInt(s.nextLine());
        t = (4 * b + l);
        System.out.print("\n---------------------------- ");
        System.out.print("\nArea Of Rectangle is = "+t);
        System.out.print("\n----------------------------- ");

    }

}

public class Abstract_Class_Using_Parameter_CircleSquareRectangle
{
    public static void main(String args [])
    {
        Area_Calculation1 obj;
        //----------------------
        obj = new Area_Circle1();
        obj.area();

        obj=new Area_Square1();
        obj.area();

        obj =new Area_Rectangle1();
        obj.area();


    }
}
/*
*
 Calculating Area of Parameter in circle
Enter Radius of circle = 5

-------------------------------
Area is = 157.0

-------------------------------
 Calculating Area of Parameter in Square
Enter Any one Square Side length = 5

-----------------------------
Area Of Square = 50
-----------------------------
 Calculating Area of Parameter in Rectangle
 Enter Length of Square = 5

 Enter Base Of Square = 5

----------------------------
Area Of Rectangle is = 25.0
-----------------------------
* */