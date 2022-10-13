package assignment12list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListWithoutSortMethodQ1 {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Priya");
		al.add("Divya");
		al.add("Navya");
		al.add("Anand");
		al.add("Swara");
		
		System.out.println("Unsorted ArrayList");
		System.out.println(al);
		
		int count=al.size();
		String temp;
		
		Object name[]=al.toArray();
		
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(((String)name[i]).compareTo((String)name[j])>0)
				{
					temp=(String)name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		System.out.println("Sorted ArrayList");
		
		for(int a=0;a<name.length;a++)
		{
			System.out.println(name[a]);
		}
		
		
	}

}
