package arraylistpractice;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student>
{
	public int compare(Student o1, Student o2) 
	{
		if(o1.age==o2.age)
		return 0;
		
		else if(o1.age>o2.age)
			return 1;
		
		else
			return -1;
	}
	

	
}
