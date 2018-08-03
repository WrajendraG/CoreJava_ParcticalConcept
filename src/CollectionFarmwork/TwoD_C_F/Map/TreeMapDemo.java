package CollectionFarmwork.TwoD_C_F.Map;

import java.util.TreeMap;

public class TreeMapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<String,String> hm=new TreeMap<String,String>();
		hm.put("A","Amit");  
		hm.put("C","Vijay");  
		hm.put("B","Rahul"); 
		hm.put("E","Amit");
		//hm.put(null,"Kaustubh");
		//hm.put(null, "ashish");
		hm.put("D",null);
		
		hm.put("F",null);
		
		// cannot have null key.
		// can have multiple null values.
		
		System.out.println(hm);

		System.out.println("------ Size of List ---------- = \n"+hm.size());

		System.out.println("--------------------------------------------------------------");
		System.out.print("\n------- If Available contains return true otherwise false ----------\n");
		System.out.println(hm.containsKey("M"));
		System.out.println(hm.containsKey("E"));
		System.out.println(hm.containsValue(null));

		System.out.print("\n--------------------------------------------------------------\n");
		System.out.println(hm.entrySet());
		System.out.println(hm.firstKey());
		System.out.println(hm.firstEntry());
		System.out.println(hm.lastKey());
		System.out.println(hm.lastEntry());
		System.out.print("\n--------------------------------------------------------------\n");

		System.out.println(hm.values());
		System.out.println(hm.keySet());

		System.out.println("Remove A = "+hm.remove("A"));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println("Replace A key to Rajendra = "+hm.replace("A","Rajendra"));
		System.out.println("Replace B key to Rajendra = "+hm.replace("B","Rajendra"));
		System.out.println(hm);
		System.out.println("get Value B = "+hm.get("B"));

		System.out.print("\n--------------------------------------------------------------\n");

		System.out.println(hm);
		System.out.println("clear all list  = ");
		hm.clear();

		System.out.println(hm);
		hm.put("B","Bye ");
		System.out.println(hm);

	}

}

//It contains only unique key elements.
//It cannot have null key but can have multiple null values.
//Maintains ascending order w.r.t. key. 
