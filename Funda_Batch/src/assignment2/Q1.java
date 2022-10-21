package assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Q1 {

	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList<String>();
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		al.add("Sunday");
		
		System.out.println(al);
		
		
	/*	Object s[]=al.toArray();
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(((String) s[i]).charAt(0)>((String) s[j]).charAt(0))
				{
					String temp=(String) s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
			System.out.println(Arrays.toString(s));
		}*/
		
		/*TreeSet<String> ts=new TreeSet<String>(al);
		System.out.println(ts);*/
		
		Collections.sort(al);
		System.out.println(al);
		
		
		
		
		
	}

}
