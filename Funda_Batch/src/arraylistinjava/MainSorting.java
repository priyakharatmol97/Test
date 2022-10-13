package arraylistinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainSorting 
{
	static void sortingByName(ArrayList<Movies> al)
	{
		System.out.println();
		System.out.println("Sorting by Name");
	
		Collections.sort(al);
		
		Iterator<Movies> id=al.iterator();
		
		while(id.hasNext())
		{
			System.out.println(id.next());
		}
	}
	
	public static void main(String[] args) 
	{
		Movies mov1=new Movies(101,"Brahmastra",200000,4f);
		Movies mov2=new Movies(102,"Ananya",700000,7.5f);
		Movies mov3=new Movies(103,"Timepass3",800000,8f);
		Movies mov4=new Movies(104,"KGF2",400000,9.5f);
		Movies mov5=new Movies(105,"RRR",300000,6.5f);
		
		ArrayList<Movies> al=new ArrayList<Movies>();
		al.add(mov1);
		al.add(mov2);
		al.add(mov3);
		al.add(mov4);
		al.add(mov5);
		
		System.out.println("As It Is Name");
		Iterator<Movies> id1=al.iterator();
		while(id1.hasNext())
		{
			System.out.println(id1.next());
		}
		
		
		sortingByName(al);
		

	}

}
