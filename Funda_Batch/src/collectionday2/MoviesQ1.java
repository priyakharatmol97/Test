package collectionday2;

import java.util.Comparator;

public class MoviesQ1 implements Comparator<Item>
{
	int m_id;
	String name;
	int b_collection;
	float rating;
	
	public MoviesQ1(int m_id,String name,int b_collection,float rating)
	{
		this.m_id=m_id;
		this.name=name;
		this.b_collection=b_collection;
		this.rating=rating;
	}

	public String toString()
	{
		return m_id+" "+name+" "+b_collection+" "+rating;
	}

	@Override
	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int rating() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}
