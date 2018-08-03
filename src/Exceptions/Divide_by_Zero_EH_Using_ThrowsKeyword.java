package Exceptions;

import java.util.Scanner;

/**
 * Created by WrajendraG on 2/7/2017.
 */
class Division
{
    void division_Division() throws ArithmeticException // Unchecked exception is Optional to heating throws keyword.
                                                                                                // And checked is compulsory to heating throws Other Wise We wiii get Error.
    {

        float a, b,v=0;

        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter Two number");
        System.out.print("\n1st Number = ");
        a = Float.parseFloat(s.nextLine());
        System.out.print("\n2st Number = ");
        b = Float.parseFloat(s.nextLine());

            v = (a / b);    // Divide by zero is Unchecked exception  and it's with in  ArithmeticException class.[java.lang.Exception]

            if (b == 0)
            {
                throw new ArithmeticException();
            }
            else
                {
                System.out.print("\nDivision  Number is = " + v);
                }
    }

}
public class Divide_by_Zero_EH_Using_ThrowsKeyword
    {

        public static void main (String args [])
            {

                Division obj = new Division();

                    try
                        {
                            obj.division_Division();
                        }
                        catch (ArithmeticException en)
                        {

                            System.out.print("Zero is not possible to be divide in below (A/0) ");
                        }
            }
    }
