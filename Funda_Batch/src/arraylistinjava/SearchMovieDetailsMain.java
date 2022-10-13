package arraylistinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SearchMovieDetailsMain 
{
	static void sortByRating(ArrayList<Movies_Q1> al)
	{
		System.out.println("Sorting by Rating");
		Collections.sort(al, new Rating());
		
		Iterator<Movies_Q1> id2=al.iterator();
		while(id2.hasNext())
		{
			System.out.println(id2.next());
		}
		System.out.println();
	}
	
	
	static void greaterThan7Rating(ArrayList<Movies_Q1> al)
	{
      System.out.println("Rating Greter Than 7");
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).m_rating>7)
			{
				al.remove(i);
				i--;
			}
		}
		System.out.println(al);
		System.out.println();
		
	}
	
	static void onlyRRRMovieDisplay(ArrayList<Movies_Q1> al)
	{
		System.out.println("Only RRR Movie details Display");
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).m_name.equals("RRR"))
			{
				System.out.println(al.get(i));
			}
			System.out.println();
		}
		
	}
	
	static void SortingBOC(ArrayList<Movies_Q1> al)
	{
		System.out.println("Sorting by boxOffice Collection");
		Collections.sort(al, new BCollection());
		Iterator<Movies_Q1> id4=al.iterator();
		
		while(id4.hasNext())
		{
			System.out.println(id4.next());
		}
		
	}

	
	
	public static void main(String[] args) 
	{
		ArrayList<Movies_Q1> al=new ArrayList<Movies_Q1>();
		Movies_Q1 mov1=new Movies_Q1(101,200000,"Brahmastra",5f);
		Movies_Q1 mov2=new Movies_Q1(102,700000,"Ananya",7f);
		Movies_Q1 mov3=new Movies_Q1(103,800000,"Timepass3",8f);
		Movies_Q1 mov4=new Movies_Q1(104,1000000,"KGF2",9f);
		Movies_Q1 mov5=new Movies_Q1(105,300000,"RRR",4f);
		
		al.add(mov1);
		al.add(mov2);
		al.add(mov3);
		al.add(mov4);
		al.add(mov5);
		
		sortByRating(al);
		greaterThan7Rating(al);
		onlyRRRMovieDisplay(al);
		SortingBOC(al);
	}

}
