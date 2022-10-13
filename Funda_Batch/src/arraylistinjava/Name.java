package arraylistinjava;

import java.util.Comparator;

public class Name implements Comparator<Movies>
{

	@Override
	public int compare(Movies o1, Movies o2) 
	{
		return o1.m_name.compareTo(o2.m_name);
	}

	


}
