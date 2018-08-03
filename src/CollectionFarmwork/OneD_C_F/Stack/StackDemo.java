package  CollectionFarmwork.OneD_C_F.Stack;
import java.util.Stack;

public class StackDemo 
{

	public static void main(String[] args) 
	{

		System.out.print("\n ------------------ Method of Stack( 1 push()  ) -----------------------------------\n");

		Stack<String> s=new Stack<String>();
		s.push("Kaustubh");
		s.push("Nikita");
		s.push("Gaurav");
		s.push(null);		//Accepts null value
		s.push("Priyanka");
		s.push("Priyanka");	// Duplication is allowed
		System.out.println(s);
		System.out.println("-------------------------------------------------------------------------------------------------");
		Stack s2	=	new Stack();

		s2.push("Rajendera");
		s2.push("9823337174");
		s2.push("Hello");
		System.out.println(s2);
		System.out.print(s2.empty());
		System.out.println("Pop element First on the stack its LIFO = "+s2.pop());
		System.out.println(s2);

		System.out.print("\n ------------------ Method of Stack( 2 pop()  ) -----------------------------------\n");
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.lastElement());

		System.out.print("\n ------------------ Method of Stack( 3 element(4) ) -----------------------------------\n");

		System.out.println(s.elementAt(3));
		System.out.println(s);

	}

}
/*

This Stack All Vector Feature and Method is Extended  (class Stack extends Vector )

 ------------------ Method of Stack( 1 push()  ) -----------------------------------
[Kaustubh, Nikita, Gaurav, null, Priyanka, Priyanka]
-------------------------------------------------------------------------------------------------
[Rajendera, 9823337174, Hello]
falsePop element First on the stack its LIFO = Hello
[Rajendera, 9823337174]

 ------------------ Method of Stack( 2 pop()  ) -----------------------------------
Priyanka
[Kaustubh, Nikita, Gaurav, null, Priyanka]
Priyanka

 ------------------ Method of Stack( 3 element(4) ) -----------------------------------
null
[Kaustubh, Nikita, Gaurav, null, Priyanka]

* */