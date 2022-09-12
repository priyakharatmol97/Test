package classandobjects;

import java.util.Scanner;

public class ReturnPercentage 
{
	   int totalCal(int m1,int m2,int m3,int m4,int m5)
	   {
		   int total=m1+m2+m3+m4+m5;
	       return total;
	   }
	float percentCal(int total)
	{
		float percent=total/5;
		System.out.println("Percent is:"+percent);
		return percent;
	}
	void grade(int total)
	{
		if(percentCal(total)>=80)
		{
			System.out.println("Distinction");
		}
		else if(total>=70 && total<80)
		{
			System.out.println("First Class");
		}
		else if(total>=60 && total<70)
		{
			System.out.println("Second Class");
		}
		else if(total>=50 && total<60)
		{
			System.out.println("Third Class");
		}
		else if(total>=50 && total<40)
		{
			System.out.println("Fourth Class");
		}
		else if(total>=40 && total<35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) 
	{
		int m1,m2,m3,m4,m5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a five subject marks:");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		
		ReturnPercentage rp=new ReturnPercentage ();
		int total=rp.totalCal(m1, m2, m3, m4, m5);
		//float percent=rp.percentCal(total);
		rp.grade(total);
		

	}

}
