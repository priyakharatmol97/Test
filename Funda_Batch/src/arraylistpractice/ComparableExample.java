package arraylistpractice;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample implements Comparable <ComparableExample>
{
	int rollNo;
	String name;
	int age;
	
	ComparableExample(int rollNo,String name,int age)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}

	
	@Override
	public int compareTo(ComparableExample o)
	{
		if(age==o.age)
		return 0;
		
		else if(age>o.age)
			return 1;
		
		else
			return -1;
	}
	public static void main(String[] args) 
	{
		
		//ComparableExample c=new ComparableExample(101,"Divya",23);
		ArrayList<ComparableExample>al=new ArrayList<ComparableExample>();
		al.add(new ComparableExample(101,"Vijay",23));
		al.add(new ComparableExample(106,"Ajay",27));
		al.add(new ComparableExample(105,"Jay",21));
		
		Collections.sort(al);
		
		for(ComparableExample ce:al)
		{
			System.out.println(ce.rollNo+" "+ce.name+" "+ce.age);
		}

	}

	

	
}
