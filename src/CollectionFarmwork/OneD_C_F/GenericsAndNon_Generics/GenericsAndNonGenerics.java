package  CollectionFarmwork.OneD_C_F.GenericsAndNon_Generics;

import java.util.ArrayList;

public class GenericsAndNonGenerics
{

	public static void main(String[] args)
	{
		//Non generic

		ArrayList l1=new ArrayList();
		l1.add("abc");
		l1.add(102);
		l1.add("PQR");
		l1.add(102);
		l1.add(104);

		System.out.println("Non generics "+l1);

		// generic	-	String
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("abc");
		l2.add("xyz");
		l2.add("PQR");
		l2.add("efg");

		System.out.println("Generics  "+l2);

		//generic	-	Integer
		ArrayList<Integer> l3=new ArrayList<Integer>();
		l3.add(234);
		l3.add(121);
		l3.add(313);
		l3.add(587);

		System.out.println("Generics "+l3);
	}

}
