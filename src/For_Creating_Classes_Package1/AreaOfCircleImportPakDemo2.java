package For_Creating_Classes_Package1;

import java.util.Scanner;

/**
 * Created by raju on 27/1/17.
 */
public class AreaOfCircleImportPakDemo2

{
    double r, t;
    Scanner s = new Scanner(System.in);

   public void areaOfCircle() {
        System.out.print("\n Calculating Area of circle ");
        System.out.print("\nEnter Radius of circle = ");
        r = Integer.parseInt(s.nextLine());
        t = (3.14 * (r * r));
        System.out.print("\n-------------------------------");
        System.out.println("\nArea is = " + t);
        System.out.print("\n-------------------------------");

    }
}
