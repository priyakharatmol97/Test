package assignment2;

import java.util.Scanner;

public class NationalGame 
{
	void india()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Country Name:");
	int country=sc.nextInt();
	
	switch(country)
	{
	case 1: System.out.println("National Game of India is Hockey");
	        break;
	        
	case 2: System.out.println("China is Table Tennis"); 
	        break;
	        
	case 3: System.out.println("Bangladesh is Kabaddi");
	        break;
	        
	case 4: System.out.println("Italy is Football");
	        break;
	        
	case 5: System.out.println("United State is baseball");  
	        break;
	        
	 default: System.out.println("Invalid Game");       
	}
	
	}
		
	

	public static void main(String[] args) 
	{
		NationalGame n=new NationalGame();
		n.india();

	}

}
