
/**
 * Created by WrajendraG on 3/8/2017.

 System.out.print("\n\t======> Methods Of String class <======");

 System.out.print("\n>==============================================<\n");
 System.out.print("\n--------------> 1.  public int length() ");
 System.out.print("\nExample =");

 String str1= "Rajendra";
 String str11 = new String("Rajendra");
 System.out.print("\n Length of str1 :"+str1.length()+"  OR Length of Str11 : "+str11.length());

 System.out.print("\n>==============================================<\n");

 */

package PreDefinedClasses;

import java.lang.StringBuffer.*;

public class StringBufferMethodDemo
{
    public static void main (String args[])
    {

System.out.print("\n\t======> Methods Of StringBuffer class <======");

System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 1.  public int length() , public void setLength(new length) ");
System.out.print("\nExample =");

        StringBuffer str1= new StringBuffer("Rajendra");
        StringBuffer str11 = new StringBuffer("Waghmare");
        System.out.print("\n Length of str1 :"+str1.length()+"  OR Length of Str11 : "+str11.length());
        str1.setLength(5);
        System.out.print("\nAfter Seting Length 5 of str1(Rajendra) :"+str1);
        System.out.print("\nAfter Seting Length of str1(Rajendra) :"+str1.length());


System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 2.  public int capacity()");
System.out.print("\nExample =");

        StringBuffer str2= new StringBuffer();
        StringBuffer str22= new StringBuffer(10);
        StringBuffer str222 = new StringBuffer("JAVA");

        System.out.print("\n capacity of StringBuffer Default :"+str2.capacity());
        System.out.print("\n capacity of StringBuffer (10) :"+str22.capacity());
        System.out.print("\n capacity of StringBuffer JAVA :"+str222.capacity());

System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 3.  public char charAt(int index))");
System.out.print("\nExample =");

        StringBuffer str3 = new StringBuffer("lapTop");

        // System.out.print("\n char of String Laptop 4 :"+str3.charAt(-1));
        System.out.print("\n char of String Laptop 4 : "+str3.charAt(3));
        //  System.out.print("\n char of String Laptop 10 :"+str2.charAt(10));
        // java.lang.StringIndexOutOfBoundsException: String index out of range: -1 or 4

System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 4.  public int codePointAt(int index()");
System.out.print("\nExample =");


        StringBuffer buff = new StringBuffer("TUTORIALS");
        System.out.println("buffer = " + buff);

        // returns the codepoint at index 5
        int retval = buff.codePointAt(5);
        System.out.println("Character(unicode point) = " + retval);

System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 5. public String substring(int start)");
System.out.print("\nExample = ");

        System.out.print("\nSubstring Of Rajendra (start index): "+str1.substring(5));
        System.out.print("\nSubstring Of Rajendra(start,end) : "+str1.substring(2,5));
        System.out.print("\nSubSequence Of Rajendra(start,end) : "+str1.subSequence(2,5));


System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 6.public void trimToSize()");
System.out.print("\nExample =");


        StringBuffer buff6 = new StringBuffer("This is ");

        //buff6.append("Java Lang Package"); // append the string to StringBuffer
        System.out.println("\nAfter TrimToSize :" + buff6);
        System.out.print("\n length of string After Trim :"+buff6.capacity());
         buff6.trimToSize();            // trimToSize buffer
        System.out.println("\nProgramming :  " + buff6);
        System.out.print("\n length of string Before Trim :"+buff6.capacity());


System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 7. public String toString()");
System.out.print("\nExample =");

        StringBuffer buff7 = new StringBuffer("India ");

        System.out.println("\nbuffer = " + buff7);
        buff7.append('!');   // append character to the stringbuffer

        System.out.println("After append = " + buff7.toString());  // convert to string object and print it
System.out.print("\n--------------------------------------------------------------------------------");
        buff7 = new StringBuffer("Hi ");
        System.out.println("\nbuffer = " + buff7);

        buff7.append(123);  // append integer to the stringbuffer
        System.out.println("\nAfter append = " + buff7.toString()); // convert to string object and print it

System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 8. public StringBuffer append(char c) , (char[] str) , ");
System.out.print("\nExample =");

        StringBuffer str8 = new StringBuffer("KKWIEER");
        System.out.print("\n String After append : "+str8);
        str8.append(" Nashik");// Give One space Here Before Nashik proper output
        System.out.print("\n String Before append : "+str8);
System.out.print("\n--------------------------------------------------------------------------------");

              //  String arr[] = {'P','A','N'};
        char[] array = new char[]{'p','o','i','n','t'};
        str8.append(array);
        System.out.print("\n String Before append : "+str8);

System.out.print("\n--------------------------------------------------------------------------------");

System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 9. public StringBuffer insert(int index, char[] str, int offset, int len) ");
System.out.print("\nExample =");

            StringBuffer str9 = new StringBuffer("Rajendra");
            str9.insert(5,array,1,4);
        System.out.print("\nAfter Insert = "+str9); //Rajenointdra

System.out.print("\n--------------------------------------------------------------------------------");



System.out.print("\n>==============================================<\n");
System.out.print("\n--------------> 10. ");
System.out.print("\nExample =");






    }

}
