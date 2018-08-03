package  CollectionFarmwork.OneD_C_F.PriorityQueueDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo 
{
	public static void main(String args[])
	{

			System.out.print("\n ------------------ Method of PriorityQueue( 1 add()  ) -----------------------------------\n");

		PriorityQueue<String> p=new PriorityQueue<String>();

		p.add("Priyanka");
		p.add("Shyam");
		p.add("Nikita");
		p.add("Bulu");
		p.add("Ritesh");
		p.add("Gaurav");
		p.add("Ritesh"); 
		p.add("Kaustubh");
		p.add("Ashish");
		p.add("Aashish");	//duplication is allowed.
		//p.add(null);// does not accepts null value Because of Queue

		System.out.println(p);

			System.out.print("\n ------------------ Method of PriorityQueue( 2 offer() ) -----------------------------------\n");

		p.offer("Rajendra");
		p.offer("Waghmare");
		System.out.println(p);
		System.out.print("\n ------------------ Method of PriorityQueue( 3 peek() ) -----------------------------------\n");

		System.out.println("Peek: "+p.peek()); // Return head Element of queue
		System.out.println(p);
		System.out.print("\n ------------------ Method of PriorityQueue( 3 poll() ) -----------------------------------\n");

		System.out.println("Poll "+p.poll());	// Return head Element and Remove
		System.out.println(p);

		System.out.print("\n ------------------ Method of PriorityQueue( 3 element() ) -----------------------------------\n");

		System.out.println("Element : "+p.element());
		System.out.println(p);

		System.out.print("\n ------------------ Method of PriorityQueue( 3 remove() ) -----------------------------------\n");

		System.out.println("Remove :"+p.remove());
		System.out.print("\n -----------------------------------------------------------------------------------\n");
		System.out.println(p.remove("Ritesh"));
		System.out.println(p);

		System.out.print("\n ------------------ Method of PriorityQueue( 3 toArray() ) -----------------------------------\n");

		Object[] obj=p.toArray();
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}

		System.out.print("\n ------------------ Method of PriorityQueue( 3 clear () ) -----------------------------------\n");
		p.clear();


	}
}
/*
 ------------------ Method of PriorityQueue( 2 offer() ) -----------------------------------
[Aashish, Ashish, Gaurav, Kaustubh, Bulu, Priyanka, Ritesh, Shyam, Nikita, Ritesh, Rajendra, Waghmare]

 ------------------ Method of PriorityQueue( 3 peek() ) -----------------------------------
Peek: Aashish
[Aashish, Ashish, Gaurav, Kaustubh, Bulu, Priyanka, Ritesh, Shyam, Nikita, Ritesh, Rajendra, Waghmare]

 ------------------ Method of PriorityQueue( 3 poll() ) -----------------------------------
Poll Aashish
[Ashish, Bulu, Gaurav, Kaustubh, Rajendra, Priyanka, Ritesh, Shyam, Nikita, Ritesh, Waghmare]

 ------------------ Method of PriorityQueue( 3 element() ) -----------------------------------
Element : Ashish
[Ashish, Bulu, Gaurav, Kaustubh, Rajendra, Priyanka, Ritesh, Shyam, Nikita, Ritesh, Waghmare]

 ------------------ Method of PriorityQueue( 3 remove() ) -----------------------------------
Remove :Ashish

 -----------------------------------------------------------------------------------
true
[Bulu, Kaustubh, Gaurav, Nikita, Rajendra, Priyanka, Ritesh, Shyam, Waghmare]

 ------------------ Method of PriorityQueue( 3 toArray() ) -----------------------------------
Bulu
Kaustubh
Gaurav
Nikita
Rajendra
Priyanka
Ritesh
Shyam
Waghmare

 ------------------ Method of PriorityQueue( 3 clear () ) -----------------------------------

* */