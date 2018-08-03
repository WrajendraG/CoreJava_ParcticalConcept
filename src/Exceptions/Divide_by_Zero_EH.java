
package Exceptions;

import java.util.Scanner;
import  java.lang.Exception;
public class Divide_by_Zero_EH
{
        public static void main(String args[])
        {
              try {

                  float a, b, v=0;
                  Scanner s = new Scanner(System.in);

                  System.out.print("\nEnter Two number");
                  System.out.print("\n1st Number = ");
                  a = Float.parseFloat(s.nextLine());
                  System.out.print("\n2st Number = ");
                  b = Float.parseFloat(s.nextLine());

                  v = (a / b);
              }
                catch (Exception e)
                    {
                        System.err.print(e); //
                    }
        }
}
