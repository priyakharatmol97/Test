package arraylistinjava;

import java.util.ArrayList;

import collectionday2.MoviesQ1;

public class MoviesMain {

	public static void main(String[] args)
	{
		Movies mov1=new Movies(101,"Brahmastra",200000,5.6f);
		Movies mov2=new Movies(102,"Ananya",700000,7.3f);
		Movies mov3=new Movies(103,"Timepass3",800000,8.4f);
		Movies mov4=new Movies(104,"KGF2",400000,9.9f);
		Movies mov5=new Movies(105,"RRR",300000,4.2f);
		
		ArrayList<Movies> al=new ArrayList<Movies>();
		al.add(mov1);
		al.add(mov2);
		al.add(mov3);
		al.add(mov4);
		al.add(mov5);
		System.out.println(al);

	}

}
