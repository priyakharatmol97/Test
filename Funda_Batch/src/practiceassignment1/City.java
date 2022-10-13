package practiceassignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class City {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("pune");
		al.add("mumbai");
		al.add("pune");
		al.add("mumbai");
		al.add("nashik");
		al.add("pune");
		
		System.out.println(al);
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for(String s:al)
		{
			Integer count=hm.get(s);
			if(count==null)
			{
				count=0;
			}
			hm.put(s, count+1);
		}
		for(Map.Entry<String, Integer> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	
	}

}
