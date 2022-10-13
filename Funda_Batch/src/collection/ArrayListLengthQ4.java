package collection;

import java.util.ArrayList;


public class ArrayListLengthQ4 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Sunday");
		al.add("Monday");
		al.add("Friday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Saturday");
		
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).length()>=7)
			{
				System.out.print(al.get(i)+" ");
			}
			else
			{
				al.remove(i);
			}
		}
	}

}
