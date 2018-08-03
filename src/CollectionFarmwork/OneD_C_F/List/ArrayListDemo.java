package  CollectionFarmwork.OneD_C_F.List;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.lang.String;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{

		ArrayList<String> l = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();

	System.out.print("\n ------------------ Method of ArrayList   (  1. add(\"One\");  ) -----------------------------------\n");
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("Four");
		l.add("Four");									//Duplication is allowed
		l.add(null);											//Null value is also accepted here
		System.out.println(l);
		l2.add("Rajendra");
		l2.add("Waghmare");

		System.out.print("\n ------------------ Method of ArrayList   (  2. addAll(2,l2); ) -----------------------------------\n");
		l.addAll(2,l2);
		System.out.println(l);

		System.out.print("\n ------------------ Method of ArrayList   (  3. add(0,\"CheckIndex\");  ) -----------------------------------\n");
		ArrayList<String> l3 = new ArrayList<String>();
		l3.add(0,"CheckIndex");
		l3.add(1,"Rajendra");
		l3.add(2,"Waghmare");
		System.out.print(l3.get(0));

		System.out.print("\n ------------------ Method of ArrayList   (  4. indexOf(\"CheckIndex\");  ) -----------------------------------\n");
		System.out.print(l3.indexOf("CheckIndex"));

		System.out.print("\n ------------------ Method of ArrayList   (  5. lastIndexOf(\"Waghmare\")  ) -----------------------------------\n");
		System.out.print(l3.lastIndexOf("Waghmare"));

		System.out.print("\n ------------------ Method of ArrayList   (  6. iterator();  ) -----------------------------------\n");
		Iterator<String> itr=l.iterator();
		
		System.out.println("\nActual way of printing array:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.print("\n ------------------ Method of ArrayList   (  7. size();  -----------------------------------\n");
		System.out.println("Size :"+l.size());

		System.out.print("\n ------------------ Method of ArrayList   (  8. remove(\"One\");  ) -----------------------------------\n");
		l.remove("One");	//remove element
		System.out.println(l);

		System.out.print("\n ------------------ Method of ArrayList   (  9. contains(\"One\") ; ) -----------------------------------\n");
		System.out.println("Contains one:"+l.contains("One"));
		
		System.out.println("Contains two:"+l.contains("Two"));
		System.out.print("\n ------------------ Method of ArrayList   (  10. set(1,\"Sonali\");  ) -----------------------------------\n");
			Object obj;
			obj = l3.set(2,"Deepak");
			System.out.print("\n Now We Repalce "+obj+" by "+l3.get(2));
			l3.set(1,"Sonali"); // simlple is this
			System.out.print("\n New List is = "+l3);

		System.out.print("\n ------------------ Method of ArrayList   (  11. subList(0,2  ); ) -----------------------------------\n");
			System.out.println(l3.subList(0,2));

		System.out.print("\n ------------------ Method of ArrayList   (  12. clear() ; ) -----------------------------------\n");
		l.clear(); // All Clear
		System.out.println(l);
		
	}

}

/*

 ------------------ Method of ArrayList   (  1. add("One");  ) -----------------------------------
[One, Two, Three, Four, Four, null]

 ------------------ Method of ArrayList   (  2. addAll(2,l2); ) -----------------------------------
[One, Two, Rajendra, Waghmare, Three, Four, Four, null]

 ------------------ Method of ArrayList   (  3. add(0,"CheckIndex");  ) -----------------------------------
CheckIndex
 ------------------ Method of ArrayList   (  4. indexOf("CheckIndex");  ) -----------------------------------
0
 ------------------ Method of ArrayList   (  5. lastIndexOf("Waghmare")  ) -----------------------------------
2
 ------------------ Method of ArrayList   (  6. iterator();  ) -----------------------------------

Actual way of printing array:
One
Two
Rajendra
Waghmare
Three
Four
Four
null

 ------------------ Method of ArrayList   (  7. size();  -----------------------------------
Size :8

 ------------------ Method of ArrayList   (  8. remove("One");  ) -----------------------------------
[Two, Rajendra, Waghmare, Three, Four, Four, null]

 ------------------ Method of ArrayList   (  9. contains("One") ; ) -----------------------------------
Contains one:false
Contains two:true

 ------------------ Method of ArrayList   (  10. set(1,"Sonali");  ) -----------------------------------

 Now We Repalce Waghmare by Deepak
 New List is = [CheckIndex, Sonali, Deepak]
 ------------------ Method of ArrayList   (  11. subList(0,2  ); ) -----------------------------------
[CheckIndex, Sonali]

 ------------------ Method of ArrayList   (  12. clear() ; ) -----------------------------------
[]


 */