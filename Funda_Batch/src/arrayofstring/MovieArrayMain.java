package arrayofstring;

import java.util.Arrays;
import java.util.Scanner;

public class MovieArrayMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		Movie m[]=new Movie[size];
		
	
		
		for(int i=0;i<size;i++)
		{
			System.out.println("ENter mid");
			int mid=sc.nextInt();
			System.out.println("Enter Movie Name ");
			String movieName=sc.next();
			System.out.println("ENter year of release");
			int releaseYear=sc.nextInt();
			System.out.println("ENter boc");
			int boxOfficeCollection=sc.nextInt();
			System.out.println("ENter producer");
			String producer=sc.next();
			
			
			
			m[i]=new Movie(mid,movieName,releaseYear,boxOfficeCollection,producer);
		
		}
		//System.out.println(Arrays.toString(m));
			for(Movie a:m)
			{
				if(a.boxOfficeCollection>50000000 && a.producer.equals("EktaKapoor"))
				{
					System.out.println(a.producer+" "+a.boxOfficeCollection);
					
					
				}
				//System.out.println(a);
				
				
			}
			
		}

	

}
