package assignment12list;

import java.util.Comparator;

public class Location implements Comparator<Clinic>
{

	@Override
	public int compare(Clinic o1, Clinic o2) 
	{
		return o1.location.compareTo(o2.location);
	}

}
