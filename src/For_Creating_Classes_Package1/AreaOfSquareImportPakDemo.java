package For_Creating_Classes_Package1;

import java.util.Scanner;

/**
 * Created by raju on 27/1/17.
 */
public class AreaOfSquareImportPakDemo
{

    int side,t;
    Scanner s = new Scanner(System.in);
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
