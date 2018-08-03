package  CollectionFarmwork.OneD_C_F.List;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<String> l = new LinkedList<String>();
		System.out.print("\n ------------------ Method Of LinkedList   (  1. add(\"One\");  ) -----------------------------------\n");
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("Four");
		l.add("Four");		//Duplication is allowed
		l.add(null);				//Null value is also accepted here
		System.out.println(l);
		System.out.print("\n ------------------ Method of LinkedList   (  2. addAll(1,l2);  -----------------------------------\n");
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("Engineering");
		l2.add("Rajendra");
		l2.add("Waghmare");
		l2.add("KKW");
		System.out.println(l.addAll(1,l2));
		System.out.println(l);
		System.out.print("\n ------------------ Method of LinkedList   (  3. addFirst(\"IamFirst\"); -----------------------------------\n");
			l.addFirst("IamFirst");
			l.addLast("IamLast");
			System.out.print(l);
		System.out.print("\n ------------------ Method of LinkedList   (  4. get(int index),First ,List; -----------------------------------\n");
		System.out.println(l.get(1));
		System.out.println(l2.getFirst());
		System.out.println(l.getLast());
		System.out.print("\n ------------------ Method of LinkedList   (  5. remove(int index),First ,List; -----------------------------------\n");
			l.remove(2);
		   System.out.println(l2);
			System.out.println(l2.remove("Rajendra"));
			l.removeFirst();
			l.removeLast();
			System.out.println(l);
			System.out.println(l2);
		System.out.print("\n ------------------ Method of LinkedList   (  5. size; -----------------------------------\n");
		System.out.println("Size :"+l.size());

		System.out.print("\n ------------------ Method of LinkedList   (  6. iterator(); -----------------------------------\n");
		Iterator<String> itr=l.iterator();
		
		System.out.println("\nActual way of printing array:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


		System.out.print("\n ------------------ Method of LinkedList   (  7. indexof(); -----------------------------------\n");
		System.out.println("Index of three :"+l.indexOf("Three"));	//Index of

		System.out.print("\n ------------------ Method of LinkedList   (  8. contains(\"One\"); -----------------------------------\n");
		System.out.println("Contains one:"+l.contains("One"));
		
		System.out.println("Contains two:"+l.contains("Two"));

		System.out.print("\n ------------------ Method of LinkedList   (  9. clear(); -----------------------------------\n");
		l.clear(); // All Clear
		
		System.out.println(l);
	}
	
}
/*
* ------------------ Method Of LinkedList   (  1. add("One");  ) -----------------------------------
[One, Two, Three, Four, Four, null]

 ------------------ Method of LinkedList   (  2. addAll(1,l2);  -----------------------------------
true
[One, Engineering, Rajendra, Waghmare, KKW, Two, Three, Four, Four, null]

 ------------------ Method of LinkedList   (  3. addFirst("IamFirst"); -----------------------------------
[IamFirst, One, Engineering, Rajendra, Waghmare, KKW, Two, Three, Four, Four, null, IamLast]
 ------------------ Method of LinkedList   (  4. get(int index),First ,List; -----------------------------------
One
Engineering
IamLast

 ------------------ Method of LinkedList   (  5. remove(int index),First ,List; -----------------------------------
[Engineering, Rajendra, Waghmare, KKW]
true
[One, Rajendra, Waghmare, KKW, Two, Three, Four, Four, null]
[Engineering, Waghmare, KKW]

 ------------------ Method of LinkedList   (  5. size; -----------------------------------
Size :9

 ------------------ Method of LinkedList   (  6. iterator(); -----------------------------------

Actual way of printing array:
One
Rajendra
Waghmare
KKW
Two
Three
Four
Four
null

 ------------------ Method of LinkedList   (  7. indexof(); -----------------------------------
Index of three :5

 ------------------ Method of LinkedList   (  8. contains("One"); -----------------------------------
Contains one:true
Contains two:true

 ------------------ Method of LinkedList   (  9. clear(); -----------------------------------
[]

* */
