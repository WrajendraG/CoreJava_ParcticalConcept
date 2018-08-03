package PreDefinedClasses;

public class StringMethodDemo
{
    public static void main (String args[])
    {

System.out.print("\n\t======> Methods Of String class <======");

System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 1.  public int length() ");
System.out.print("\nExample =");

                String str1= "Rajendra";
                String str11 = new String("Rajendra");

                System.out.print("\n Length of str1 :"+str1.length()+"  OR Length of Str11 : "+str11.length());

System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 2 . public int trim() ");
System.out.print("\nExample =");


            String str3 = "   Rajendra    ";
            System.out.print("\nString :  "+str3.trim());
            System.out.println("\nBefore trim Length of String : "+str3.length());
            String str33 = str3.trim();
            System.out.print("\nTrim :  "+str33.trim());
            System.out.println("\nAfter trim() Length of String : "+str33.length());

System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 3 . ");
System.out.print("\nExample =");




    }

}
