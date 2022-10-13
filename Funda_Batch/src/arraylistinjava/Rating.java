package arraylistinjava;

import java.util.Comparator;

public class Rating implements Comparator<Movies_Q1>
{

	@Override
	public int compare(Movies_Q1 o1, Movies_Q1 o2) 
	{
		return o1.m_rating.compareTo(o2.m_rating);
	}

}
