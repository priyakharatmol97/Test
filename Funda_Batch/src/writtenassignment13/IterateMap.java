package writtenassignment13;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(101, "Java");
		hs.put(102, "C++");
		hs.put(103, ".Net");
		hs.put(104, "Data Structure");
		hs.put(105, "C#");
		
		System.out.println(hs);

		for(Map.Entry<Integer,String> m: hs.entrySet())
		{
			System.out.println(m.getKey());
		}
	
	}

}
