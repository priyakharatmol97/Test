package collectionday2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q5 implements Comparator<Q5_1>
{
	int m_id;
	String name;
	int b_collection;
	float rating;
	
	public Q5(int m_id,String name,int b_collection,float rating)
	{
		super();
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
	public int compare(Q5_1 o1, Q5_1 o2)
	{
		
		return 0;
	}

	
	
}
