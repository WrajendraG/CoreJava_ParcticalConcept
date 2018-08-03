package CollectionFarmwork.TwoD_C_F.Map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(100,"Messi"); // contains unique index
		hm.put(108,"Messi");
		hm.put(104,"Vijay");
		hm.put(102,"Rahul");
		hm.put(103,"Amit");	//Duplication is allowed
		hm.put(null,"Kaustubh");
		hm.put(null,"Raj");
		//hm.put(null,"Satish");
		hm.put(105,null);
		hm.put(106,null);

		// can accept one null key
		// Can have multiple null values
		System.out.println(hm);

		System.out.println(hm.size());

		System.out.println("Get Value 103:"+hm.get(103));

		System.out.println(hm.remove(null));

		System.out.println(hm);

		hm.clear();

		System.out.println(hm);
	}

}
