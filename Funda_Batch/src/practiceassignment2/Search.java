package practiceassignment2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Search 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, String> hs=new HashMap<Integer, String>();
		hs.put(1, "Sunday");
		hs.put(2, "Monday");
		hs.put(3, "Tuesday");
		hs.put(4, "Wednesday");
		hs.put(5, "Thursday");
		hs.put(6, "Friday");
		hs.put(7, "Saturday");
		
		System.out.println("Enter Day");
		Integer day=sc.nextInt();
		
		Set<Entry<Integer, String>> set=hs.entrySet();
		for(Map.Entry<Integer, String> en : set) 
		{
			if(day.equals(en.getKey())) 
			{
				System.out.println(en.getKey()+" "+en.getValue());
			}
		}
	}


}
