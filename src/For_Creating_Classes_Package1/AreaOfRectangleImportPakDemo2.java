package For_Creating_Classes_Package1;

import java.util.Scanner;

public class AreaOfRectangleImportPakDemo2
{
    float l,b,t;
    Scanner s = new Scanner(System.in);
  public   void areaOfRectangle()
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
