package arrayofstring;

import java.util.Scanner;

public class MovieGetSetMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		MovieGetSet m[]=new MovieGetSet[size];
		
	
		
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
			
			
			MovieGetSet mov= new MovieGetSet();
			mov.setMid(mid);
			mov.setMovieName(movieName);
			mov.setReleaseYear(releaseYear);
			mov.setBoxOfficeCollection(boxOfficeCollection);
			mov.setProducer(producer);
			
			m[i]=mov;
			
		}
			
			
			
			
			for(MovieGetSet mov:m)
			{
				if(mov.boxOfficeCollection>50000000 && mov.producer.equals("EktaKapoor"))
				{
					System.out.println(mov.producer+" "+mov.boxOfficeCollection);
					
					
				}

			}
	}
}


