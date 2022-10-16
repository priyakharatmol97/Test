package practiceassignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Mapping 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, String> hs=new HashMap<Integer, String>();
		hs.put(1, "Fan");
		hs.put(2, "Light");
		hs.put(3, "Tv");
		hs.put(4, "Ac");
	    hs.put(5, "Refrigerator");
		hs.put(6, "WashingMachine");
		hs.put(7, "Laptop");
		
		System.out.println("Enter Electronic Values ");
		String electricalValue=sc.next();
		
		
		Set<Entry<Integer, String>> set=hs.entrySet();
		for(Map.Entry<Integer, String> en : set) 
		{
			if(en.getValue().contains(electricalValue))
			{
				
				System.out.println(en.getValue().contains(electricalValue));
			}

		}
	
		
	}

}


