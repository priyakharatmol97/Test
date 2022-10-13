package collectionday2;

import java.util.ArrayList;
import java.util.Iterator;

public class Q3 {

	public static void main(String[] args) 
	{
		MoviesQ1 mov1=new MoviesQ1(1,"RRR",200000,8.5f);
		MoviesQ1 mov2=new MoviesQ1(2,"Ananya",700000,7);
		MoviesQ1 mov3=new MoviesQ1(3,"Timepass3",800000,8);
		MoviesQ1 mov4=new MoviesQ1(4,"KGF2",1000000,9);
		MoviesQ1 mov5=new MoviesQ1(5,"GoodBye",300000,4);
		
		ArrayList<MoviesQ1> al=new ArrayList<MoviesQ1>();
		al.add(mov1);
		al.add(mov2);
		al.add(mov3);
		al.add(mov4);
		al.add(mov5);
		
		Iterator<MoviesQ1> it=al.iterator();
		
		while(it.hasNext())
		{
			MoviesQ1 m=it.next();
			
		}
		System.out.println(al.get(0));
		
	
		

	}

}
