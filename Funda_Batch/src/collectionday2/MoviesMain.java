package collectionday2;

import java.util.ArrayList;
import java.util.Iterator;

public class MoviesMain {

	public static void main(String[] args) 
	{
		MoviesQ1 mov1=new MoviesQ1(101,"Brahmastra",200000,5);
		MoviesQ1 mov2=new MoviesQ1(102,"Ananya",700000,7);
		MoviesQ1 mov3=new MoviesQ1(103,"Timepass3",800000,8);
		MoviesQ1 mov4=new MoviesQ1(104,"KGF2",1000000,9);
		MoviesQ1 mov5=new MoviesQ1(105,"GoodBye",300000,4);
		
		ArrayList<MoviesQ1> al=new ArrayList<MoviesQ1>();
		al.add(mov1);
		al.add(mov2);
		al.add(mov3);
		al.add(mov4);
		al.add(mov5);
		
		Iterator<MoviesQ1> itr=al.iterator();
		
		
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	}

}
