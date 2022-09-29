package containmentusingarray;

import java.util.Arrays;
import java.util.Scanner;

public class SDMain {

	public static void main(String[] args)
	{
         Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number Of Department : ");
		int depSize=sc.nextInt();
		
		Department dt[]=new Department[depSize];      //Department Array
		
		for(int i=0;i<dt.length;i++)
		{
			System.out.println("Enter Department Id : ");
			int depId=sc.nextInt();
			System.out.println("Enter The Department Name : ");
			String depName=sc.next();
		
		System.out.println("Enter Number Of Student : ");
		int size=sc.nextInt();
		
		Student std[]=new Student[size];                //Student Array
		
		for(int j=0;j<size;j++)
		{
			System.out.println("Enter Student id :");
			int id=sc.nextInt();
			System.out.println("Enter Student Name :");
			String name=sc.next();
			System.out.println("Enter Student Marks :");
			int mark=sc.nextInt();
			System.out.println("Enter Student Email :");
			String email=sc.next();
			
			Student s1=new Student();
			
			s1.setId(id);
			s1.setName(name);
			s1.setMark(mark);
			s1.setEmail(email);
			
			std[j]=s1;	
			
		}
		Department d1=new Department();
		d1.setId(depId);
		d1.setName(depName);
		d1.setStud(std);
		
		dt[i]=d1;
	
		}
		for(Department d:dt)
		{
			System.out.println(d.getId()+" \n"+d.getName());
			System.out.println(Arrays.toString(d.getStud()));
		}


	}
 

}
