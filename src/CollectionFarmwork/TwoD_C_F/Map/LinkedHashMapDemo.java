package CollectionFarmwork.TwoD_C_F.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		hm.put(100,"Amit");  
		hm.put(106,"Vijay");  
		hm.put(102,"Rahul"); 
		hm.put(103,"Amit");
		hm.put(null,"Kaustubh");
		hm.put(null, "ashish");
		hm.put(105,null);
		
		hm.put(106,null);
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		System.out.println("Get Value 103:"+hm.get(103));
		
		System.out.println(hm.remove(null));
		
		System.out.println(hm);
		
		hm.clear();
		
		System.out.println(hm);
	}

}


// Same as hash map but it maintains insertion order 
