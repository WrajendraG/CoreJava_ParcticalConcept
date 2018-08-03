package  CollectionFarmwork.OneD_C_F.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo 
{

	public static void main(String[] args) 
	{
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Suarez");
		ts.add("Nyemar");
		ts.add("Messi");
		ts.add("Messi");	// Does not allow duplication.
		ts.add("Iniesta");	
		//ts.add(null);		// Does not accepts null value.
			
		System.out.println(ts);
		
		Iterator<String> itr=ts.iterator();
		
		System.out.println("\nActual way of printing array:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		// maintain ascending order. 
		
		System.out.println("Size : "+ts.size());
		
		System.out.println("Contains : "+ts.contains("Messi"));
		
		System.out.println("Remove :"+ts.remove("Iniesta"));
		
		System.out.println(ts);
		
		ts.clear();
		
		System.out.println(ts);
	
	}

}
