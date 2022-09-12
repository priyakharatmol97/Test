package arrayofstring;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeArrayMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		
		EmployeeArray emp[]=new EmployeeArray[size];
		//Employee e1
		/*emp[0]=new EmployeeArray(101,"Priya","HR",70000);
		emp[1]=new EmployeeArray(102,"Riya","HR",60000);
		emp[2]=new EmployeeArray(103,"Rahul","Sales",40000);
		emp[3]=new EmployeeArray(104,"Ramesh","Marketing",50000);
		emp[4]=new EmployeeArray(105,"Pooja","HR",75000);*/
		//System.out.println(Arrays.toString(emp));
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the id,name,dept,salary;");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int salary=sc.nextInt();
			
			
			emp[i]=new EmployeeArray(id,name,dept,salary);
		}
		
		System.out.println(Arrays.toString(emp));
		
		
		for(EmployeeArray e:emp)
		{
			/*if(e.dept.equalsIgnoreCase("hr));"
					{
						System.out.println(e);
					}*/
			if(e.salary>60000)
			{
				System.out.println(e.name+" "+e.salary);
			}
			//System.out.println(e);
		}
		
		

	}

}
