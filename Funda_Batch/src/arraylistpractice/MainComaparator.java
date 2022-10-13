package arraylistpractice;

import java.util.ArrayList;

public class MainComaparator 
{
	

	public static void main(String[] args) 
	{

		ArrayList<Student> al=new ArrayList<Student>();
		
		
		Student s1=new Student(1,"Nayan",28);
		Student s2=new Student(2,"Priya",21);
		
		
		
		for(Student s:al)
		{
			System.out.println(s.rollNo+" "+s.name+" "+s.age);
		}
		
		
		

	}

}
