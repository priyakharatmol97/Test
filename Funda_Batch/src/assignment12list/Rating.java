package assignment12list;

import java.util.Comparator;

public class Rating implements Comparator<Clinic> 
{

@Override
public int compare(Clinic o1, Clinic o2)
{
	return o1.rating.compareTo(o2.rating);
}
}
