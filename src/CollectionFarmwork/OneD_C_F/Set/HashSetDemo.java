package  CollectionFarmwork.OneD_C_F.Set;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {



	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Messi");
		hs.add("Nyemar");
		hs.add("Suarez");
		hs.add("Messi"); // Does not allow duplication.
		hs.add(null);	//Accepts null value.

		System.out.println(hs);

		Iterator<String> itr=hs.iterator();

		System.out.println("\nActual way of printing array:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		//does not maintain sequential order.

		System.out.println("Size : "+hs.size());

		System.out.println("Contains : "+hs.contains("Messi"));

		System.out.println("Remove :"+hs.remove(null));

		System.out.println(hs);

		hs.clear();

		System.out.println(hs);

	}

}
