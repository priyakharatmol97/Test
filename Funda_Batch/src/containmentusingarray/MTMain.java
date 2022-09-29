package containmentusingarray;

import java.util.Arrays;
import java.util.Scanner;

public class MTMain {

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter The Number Of Theater : ");
			int theaterSize=sc.nextInt();
			
			Theater t[]=new Theater[theaterSize];      
			
			for(int i=0;i<t.length;i++)
			{
				System.out.println("Enter Theater Id : ");
				int theaterId=sc.nextInt();
				System.out.println("Enter The Theater Name : ");
				String theaterName=sc.next();
			
			System.out.println("Enter Number Of Movies : ");
			int size=sc.nextInt();
			
			Movies m2[]=new Movies[size];               
			
			for(int j=0;j<size;j++)
			{
				System.out.println("Enter Movies id :");
				int id=sc.nextInt();
				System.out.println("Enter Movies Name :");
				String name=sc.next();
				System.out.println("Enter Movies boc :");
				int boc=sc.nextInt();
				System.out.println("Enter Movies year:");
				int year=sc.nextInt();
				
				Movies m1=new Movies();
				
				m1.setId(id);
				m1.setName(name);
				m1.setBoc(boc);
				m1.setYear(year);
				
				m2[j]=m1;	
				
			}
			Theater t1=new Theater();
			t1.setId(theaterId);
			t1.setName(theaterName);
			t1.setM(m2);
			
			t[i]=t1;
		
			}
			for(Theater t1:t)
			{
				System.out.println(t1.getId()+" \n"+t1.getName());
				System.out.println(Arrays.toString(t1.getM()));
			}

	}

}
