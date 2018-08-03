package PreDefinedClasses;

import java.util.StringTokenizer;

/**
 * Created by WrajendraG on 3/8/2017.
 */

import java.util.StringTokenizer.*;

public class StringTokenizerMethodDemo
{
    public static void main (String args[])
    {

        System.out.print("\n\t======> Methods Of StringTokenizer class <======");

        System.out.print("\n>==============================================<\n");
        System.out.print("\n--------------> 1.  countTokens() ");
        System.out.print("\nExample =");

        StringTokenizer str1= new StringTokenizer("Rajendra");
        StringTokenizer str11 = new StringTokenizer("Waghmare Nalwandi Beed ");
        StringTokenizer str111 = new StringTokenizer("Waghmare # Nalwandi # Beed ","#");
        System.out.print("\n  countTokens()  = "+str11.hasMoreTokens());

        System.out.print("\n countTokens()  of str1 :"+str11.countTokens());
        System.out.print("\n countTokens()  of str1 :"+str111.countTokens());

        System.out.print("\n  countTokens()  = "+str11.hasMoreElements());

System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 2.  hasMoreTokens() ");
System.out.print("\nExample =");

                    while (str11.hasMoreTokens())
                    {

                        System.out.print("\n"+str11.nextToken());
                        System.out.print("\n  hasMoreTokens()  = "+str11.hasMoreTokens());

                    }

System.out.print("\n>==============================================<\n");
        System.out.print("\n--------------> 1.  hasMoreElement() ");
        System.out.print("\nExample =");
                    while (str111.hasMoreElements())
                        {
                            System.out.print("\n  hasMoreElement()  = "+str111.hasMoreElements());

                            System.out.print("\n"+str111.nextElement());

                        }



    }
}
/*

======> Methods Of StringTokenizer class <======
>==============================================<

--------------> 1.  countTokens()
Example =
  countTokens()  = true
 countTokens()  of str1 :3
 countTokens()  of str1 :3
  countTokens()  = true
>==============================================<

--------------> 2.  hasMoreTokens()
Example =
Waghmare
  hasMoreTokens()  = true
Nalwandi
  hasMoreTokens()  = true
Beed
  hasMoreTokens()  = false
>==============================================<

--------------> 1.  hasMoreElement()
Example =
  hasMoreElement()  = true
Waghmare
  hasMoreElement()  = true
 Nalwandi
  hasMoreElement()  = true
 Beed

 */