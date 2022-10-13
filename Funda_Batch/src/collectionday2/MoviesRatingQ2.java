package collectionday2;

import java.util.Comparator;

public abstract class MoviesRatingQ2 implements Comparator<MovieRatingMain>
{
	int m_id;
	String name;
	int b_collection;
	int rating;
	
	public MoviesRatingQ2(int m_id,String name,int b_collection,int rating)
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




public void compareTo(MoviesRatingQ2 mov) 
{
	if(rating>mov.rating)
	return;
	
}
}
