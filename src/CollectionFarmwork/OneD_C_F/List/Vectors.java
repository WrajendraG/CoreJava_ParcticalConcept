package  CollectionFarmwork.OneD_C_F.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vectors 
{

	public static void main(String[] args) 
	{


		System.out.print("\n ------------------ Method Of  Vector  (  1. add()  ) -----------------------------------\n");
		Vector<String> v=new Vector<String>();//generic

		v.add("Messi");
		v.add("Nyemar");
		v.add("Suarez");
		v.add("Messi");	//Duplication is allowed
		v.add(null);			// Accepts Null value
		System.out.println(v);
		System.out.println("------------------------------------------------------------------------------------------------------------");

		Vector<String> v2=new Vector<String>();

		v2.add(0,"Rajendra");
		v2.add(1,"Waghmare");
		v2.add(2,null);
		v2.add(3,"Rajendra");
		System.out.println(v2);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		Vector v3 = new Vector();  //Non generic
		v3.addElement("rajendra");
		v3.addElement("1234");
		v3.addElement("122.34");
		System.out.println(v3);

		System.out.print("\n ------------------ Method Of Vector   (  2 iterator() ) -----------------------------------\n");
		Iterator<String> itr=v.iterator();
		
		System.out.println("\nActual way of printing array:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.print("\n --------------------------------------------------------------------------------------------------------\n");
		Iterator itr3 = v3.iterator();
		System.out.println("\nActual way of printing array:");
		while (itr3.hasNext())
		{

			System.out.println	(itr3.next());

		}
		System.out.print("\n ------------------ Method Of Vector   (  3  elementAt ) -----------------------------------\n");

		System.out.println("Element at : "+v.elementAt(1));

		System.out.print("\n ------------------ Method Of Vector   (4 indexOf() ) -----------------------------------\n");

		System.out.println("Index of : "+v.indexOf("Messi"));

		System.out.print("\n ------------------ Method Of Vector   (  5  size() ) -----------------------------------\n");

		System.out.println("Size of vector : "+v.size());

		System.out.print("\n ------------------ Method Of Vector   (  6  firstElement() &lastElement() ) -----------------------------------\n");

		System.out.println("First Element : "+v.firstElement()+" Last Element : "+v.lastElement());

		System.out.print("\n ------------------ Method Of Vector   (  7 remove() ) -----------------------------------\n");

		System.out.println("Remove :"+v.remove(3));
		
		System.out.println(v);
		System.out.print("\n ------------------ Method Of Vector   ( 8 clear() ) -----------------------------------\n");
		v.clear();
		
		System.out.println(v);
	}

}
/*

 ------------------ Method Of  Vector  (  1. add()  ) -----------------------------------
[Messi, Nyemar, Suarez, Messi, null]
------------------------------------------------------------------------------------------------------------
[Rajendra, Waghmare, null, Rajendra]
------------------------------------------------------------------------------------------------------------
[rajendra, 1234, 122.34]

 ------------------ Method Of Vector   (  2 iterator() ) -----------------------------------

Actual way of printing array:
Messi
Nyemar
Suarez
Messi
null

 --------------------------------------------------------------------------------------------------------

Actual way of printing array:
rajendra
1234
122.34

 ------------------ Method Of Vector   (  3  elementAt ) -----------------------------------
Element at : Nyemar

 ------------------ Method Of Vector   (4 indexOf() ) -----------------------------------
Index of : 0

 ------------------ Method Of Vector   (  5  size() ) -----------------------------------
Size of vector : 5

 ------------------ Method Of Vector   (  6  firstElement() &lastElement() ) -----------------------------------
First Element : Messi Last Element : null

 ------------------ Method Of Vector   (  7 remove() ) -----------------------------------
Remove :Messi
[Messi, Nyemar, Suarez, null]

 ------------------ Method Of Vector   ( 8 clear() ) -----------------------------------
[]

 */