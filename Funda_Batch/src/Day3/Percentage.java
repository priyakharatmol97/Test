package Day3;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of five subjects");
		
		float sub1=sc.nextFloat();
		float sub2=sc.nextFloat();
		float sub3=sc.nextFloat();
		float sub4=sc.nextFloat();
		float sub5=sc.nextFloat();
		
		float total;
		float avarage;
		float percentage;
		char Grade;
		
		total=sub1+sub2+sub3+sub4+sub5;
		
		avarage=total/5;
		
		percentage=total/500*100;
		
		
		if(avarage>=85)
		{
			System.out.println("A+");
			
		}
		else if(avarage>=75 && avarage<=85)
		{
			System.out.println("A");
		}
		else if(avarage>=65 && avarage<75)
		{
			System.out.println("B");
		}
		else if(avarage>=55 && avarage<65)
		{
			System.out.println("C");
		}
		else if(avarage>=45 && avarage<55)
		{
			System.out.println("D");
		}
		else if(avarage>=35 && avarage<45)
		{
			System.out.println("E");
		}
	
		else 
		{
			System.out.println("Fail");
			
		}
		System.out.println("The Total marks:"+total+"/500.0");
		System.out.println("The Avarage marks:"+avarage);
		System.out.println("The Percentage:"+percentage+"%");
		


	}

}
